package com.consumer.queueConsumer

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component


@Component
class Consumer (private var rabbitTemplate:RabbitTemplate){

    fun init(some:String="default") = println("aa: $some")

    @RabbitListener(queues = [STARTING_QUEUE])
    fun consume(messageDTO:MessageDTO) {
        //TODO: Try out asynchronous syntax
        if(messageDTO.getType() == "FORWARDABLE") {
            rabbitTemplate.convertAndSend(API_QUEUE)
        }

    }
}