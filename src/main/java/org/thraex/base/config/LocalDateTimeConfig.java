package org.thraex.base.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 鬼王
 * @date 2019/12/09 15:07
 */
@Configuration
public class LocalDateTimeConfig {

    @Value("${thraex.date-time-format.date}")
    private String FORMAT_DATE;

    @Value("${thraex.date-time-format.time}")
    private String FORMAT_TIME;

    @Value("${thraex.date-time-format.date-time}")
    private String FORMAT_DATE_TIME;

    @Bean
    public LocalDateTimeSerializer localDateTimeSerializer() {
        return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
    }

    @Bean
    public LocalDateTimeDeserializer localDateTimeDeserializer() {
        return new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
    }

    @Bean
    public LocalDateSerializer localDateSerializer() {
        return new LocalDateSerializer(DateTimeFormatter.ofPattern(FORMAT_DATE));
    }

    @Bean
    public LocalDateDeserializer localDateDeserializer() {
        return new LocalDateDeserializer(DateTimeFormatter.ofPattern(FORMAT_DATE));
    }

    @Bean
    public LocalTimeSerializer localTimeSerializer() {
        return new LocalTimeSerializer(DateTimeFormatter.ofPattern(FORMAT_TIME));
    }

    @Bean
    public LocalTimeDeserializer localTimeDeserializer() {
        return new LocalTimeDeserializer(DateTimeFormatter.ofPattern(FORMAT_TIME));
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer Jackson2ObjectMapperBuilderCustomizer() {
        return builder -> builder
                .serializerByType(LocalDateTime.class, localDateTimeSerializer())
                .deserializerByType(LocalDateTime.class, localDateTimeDeserializer())
                .serializerByType(LocalDate.class, localDateSerializer())
                .deserializerByType(LocalDate.class, localDateDeserializer())
                .serializerByType(LocalTime.class, localTimeSerializer())
                .deserializerByType(LocalTime.class, localTimeDeserializer());
    }

}
