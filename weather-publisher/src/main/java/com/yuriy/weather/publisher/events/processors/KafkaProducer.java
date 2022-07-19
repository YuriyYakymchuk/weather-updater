package com.yuriy.weather.publisher.events.processors;

import com.yuriy.weather.publisher.events.schemas.WeatherMessageData;
import com.yuriy.weather.publisher.events.schemas.WeatherMessageKey;
import com.yuriy.weather.publisher.models.WeatherData;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;

@Component
public class KafkaProducer implements Producer {

    private final Processor processor;

    public KafkaProducer(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean produceWeatherMessage(WeatherData weatherData) {
        WeatherMessageData messagePayload = new WeatherMessageData();
        messagePayload.setId(String.format("%s:%s:%n", weatherData.getCountry(), weatherData.getCity(),
                weatherData.getTime().toEpochSecond(ZoneOffset.UTC)));
        messagePayload.setCountry(weatherData.getCountry());
        messagePayload.setCity(weatherData.getCity());
        messagePayload.setTemperature(weatherData.getTemperature());
        messagePayload.setHumidity(weatherData.getHumidity());
        messagePayload.setWindSpeed(weatherData.getWindSpeed());
        messagePayload.setTime(weatherData.getTime().toEpochSecond(ZoneOffset.UTC));
        messagePayload.setCloudy(weatherData.getCloudy());

        WeatherMessageKey messageKey = new WeatherMessageKey();
        messageKey.setCountry(weatherData.getCountry());
        messageKey.setCity(weatherData.getCity());

        Message<WeatherMessageData> message = MessageBuilder.withPayload(messagePayload)
                .setHeader(KafkaHeaders.MESSAGE_KEY, messageKey)
                .build();

        return processor.output().send(message);
    }

}
