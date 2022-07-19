# weather-updater

Project implements weather data update workflow:
* weather records are created through REST API of the weather-publisher service.
* weather-publisher publishes a weather record to Kafka MB
* weather-consumer consumes weather records from Kafka and stores them in MySql DB
* Weather records can be retried and viewed by users through REST API of weather-activity service.
weather-activity service retrieves records from MySql DB


