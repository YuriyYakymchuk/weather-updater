# weatherData-updater

Project implements weatherData data update workflow:
* Weather records are created through REST API of the weatherData-publisher service.
* weatherData-publisher publishes the weatherData record to Kafka MB
* weatherData-consumer consumes weatherData records from Kafka and stores them in MySql DB
* Weather records can be retried and viewed by users through REST API of weatherData-activity service.
weatherData-activity service retrieves records from the MySql DB


