# Enumerate Business Attributes
Let's define a new batch job that will process data in the database and determine
what attribute keys appear in all the businesses. This will form our list of "known"
attributes, with the ability to add new attributes in the future.

## MongoDB processing
Spring Batch offers a [catalog](https://github.com/spring-projects/spring-batch/blob/a8f8d0bfa7f6116040a0455aa55da8fa343780ef/spring-batch-docs/modules/ROOT/pages/appendix.adoc) 
of `ItemReader` implementations and `ItemWriter` implementations.

```
2024-05-27T08:08:00.476-07:00  INFO 22336 --- [yelp-analysis] [cTaskExecutor-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=businessAttributeAnalysisJob]] launched with the following parameters: [{}]
2024-05-27T08:08:00.508-07:00  INFO 22336 --- [yelp-analysis] [cTaskExecutor-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [businessStep]
ByAppointmentOnly
AcceptsInsurance
BusinessAcceptsCreditCards
WiFi
GoodForKids
BikeParking
BusinessParking
Alcohol
RestaurantsDelivery
Ambience
RestaurantsReservations
RestaurantsTakeOut
NoiseLevel
GoodForMeal
Caters
HasTV
WheelchairAccessible
HappyHour
RestaurantsPriceRange2
DriveThru
DogsAllowed
BusinessAcceptsBitcoin
OutdoorSeating
RestaurantsAttire
RestaurantsTableService
RestaurantsGoodForGroups
Music
BestNights
CoatCheck
GoodForDancing
Smoking
BYOB
Corkage
HairSpecializesIn
BYOBCorkage
DietaryRestrictions
AgesAllowed
Open24Hours
RestaurantsCounterService
2024-05-27T08:08:07.417-07:00  INFO 22336 --- [yelp-analysis] [cTaskExecutor-1] o.s.batch.core.step.AbstractStep         : Step: [businessStep] executed in 6s909ms
2024-05-27T08:08:07.419-07:00  INFO 22336 --- [yelp-analysis] [cTaskExecutor-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=businessAttributeAnalysisJob]] completed with the following parameters: [{}] and the following status: [COMPLETED] in 6s928ms
```