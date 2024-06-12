package com.mpc.data.yelputil.configuration;

import java.util.List;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.embedding.EmbeddingRequest;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.ai.ollama.OllamaEmbeddingModel;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VectorDbConfiguration {


	@Bean
	public VectorStore vectorStore(EmbeddingModel embeddingModel) {

		return new SimpleVectorStore(embeddingModel);
	}

//	@Bean
//	public CommandLineRunner dummy(VectorStore vectorStore,
//			OllamaEmbeddingModel embeddingModel) {
//		return args -> {
//			System.out.println(vectorStore);
//			System.out.println(embeddingModel);
//			EmbeddingResponse embeddingResponse = embeddingModel.call(
//					new EmbeddingRequest(List.of("Hello World", "World is big and salvation is near"),
//							OllamaOptions.create()
//									.withModel("llama3"))
//			);
//			System.out.println("Vector dimensions: " + embeddingResponse.getResult().getOutput().size());
//			System.out.println("Vector logical byte count: " + embeddingResponse.getResult().getOutput().size() * 8);
//			System.out.println(embeddingResponse.getResult().getOutput());
//    	};
//	}
}
