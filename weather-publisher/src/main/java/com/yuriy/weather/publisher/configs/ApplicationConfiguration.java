package com.yuriy.weather.publisher.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {


    private String registryEndPoint;

    @Bean
    public SchemaRegistryClient createSchemaRegistryClientBean(@Value("${spring.cloud.stream.kafka.binder.producer-properties.schema.registry.url}") String endPoint) {
        ConfluentSchemaRegistryClient schemaRegistryClient = new ConfluentSchemaRegistryClient();
        schemaRegistryClient.setEndpoint(endPoint);
        return schemaRegistryClient;
    }
}
