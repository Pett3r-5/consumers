package com.consumer.queueConsumer.configuration

import org.springframework.amqp.core.Queue
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class RabbitConfiguration {
    @Bean
    fun conversion(): Jackson2JsonMessageConverter? {
        return Jackson2JsonMessageConverter()
    }

    @Bean
    fun rabbitQueue(): Queue {
        return Queue(STARTING_QUEUE);
    }
}