package com.mpc.data.yelputil.configuration

import com.mpc.data.yelputil.model.Business
import com.mpc.data.yelputil.service.BusinessService
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.core.repository.JobRepository
import org.springframework.batch.core.step.builder.StepBuilder
import org.springframework.batch.item.adapter.ItemProcessorAdapter
import org.springframework.batch.item.adapter.ItemWriterAdapter
import org.springframework.batch.item.data.MongoCursorItemReader
import org.springframework.batch.item.data.builder.MongoCursorItemReaderBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.transaction.PlatformTransactionManager


@Lazy
@Configuration
open class AnalysisBatchConfiguration {

    @Bean
    open fun businessMongoItemReader(mongoTemplate: MongoTemplate): MongoCursorItemReader<Business> {
        val sortOptions: MutableMap<String, Sort.Direction> = HashMap<String, Sort.Direction>()
        sortOptions["name"] = Sort.Direction.DESC
        return MongoCursorItemReaderBuilder<Business>()
            .name("businessItemReader")
            .collection("businesses")
            .jsonQuery("{}")
            .targetType(Business::class.java)
            .template(mongoTemplate)
            .sorts(sortOptions)
            .build()
    }


    @Bean
    open fun businessNoopItemWriter(businessService: BusinessService): ItemWriterAdapter<MutableSet<String>> {
        return object : ItemWriterAdapter<MutableSet<String>>() {
            init {
                targetObject = object {
                    fun sink(attributes: MutableSet<String>) {
                        for (attribute in attributes) {
                            println(attribute.toString())
                        }
                    }
                }
                targetMethod = "sink"
            }
        }
    }

    @Bean
    open fun businessAttributeAnalysisProcessor(): ItemProcessorAdapter<Business, MutableSet<String>> {
        return object: ItemProcessorAdapter<Business,MutableSet<String>>() {
            var attributeKeys : MutableSet<String> = mutableSetOf()
            init {
                targetObject = object {
                    fun sink(business: Business?): MutableSet<String> {
                        val newKeys : MutableSet<String> = mutableSetOf()
                        for (attribute in business?.attributes?.keys ?: mutableSetOf()) {
                            if(attributeKeys.add(attribute)){
                                // only the new attributes make it to the writer
                                newKeys.add(attribute)
                            }
                        }
                        return newKeys
                    }
                }
                targetMethod = "sink"
            }
        }
    }

    @Bean
    open fun businessAttributeAnalysisStep(
        jobRepository: JobRepository,
        transactionManager: PlatformTransactionManager,
        businessMongoItemReader: MongoCursorItemReader<Business>,
        businessAttributeAnalysisProcessor: ItemProcessorAdapter<Business, MutableSet<String>>,
        businessNoopItemWriter: ItemWriterAdapter<MutableSet<String>>,
    ): Step {
        return StepBuilder("businessStep", jobRepository)
            .chunk<Business, MutableSet<String>>(10, transactionManager)
            .reader(businessMongoItemReader)
            .processor(businessAttributeAnalysisProcessor)
            .writer(businessNoopItemWriter)
            .build()
    }

    @Bean
    open fun businessAttributeAnalysisJob(jobRepository: JobRepository, businessAttributeAnalysisStep: Step): Job {
        return JobBuilder("businessAttributeAnalysisJob", jobRepository)
            .start(businessAttributeAnalysisStep)
            .build()
    }
}