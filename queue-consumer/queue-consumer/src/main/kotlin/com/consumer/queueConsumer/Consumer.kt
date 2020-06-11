package com.consumer.queueConsumer

import com.consumer.queueConsumer.configuration.API_QUEUE
import com.consumer.queueConsumer.configuration.STARTING_QUEUE
import com.consumer.queueConsumer.repository.MessageRepository
import kotlinx.coroutines.runBlocking
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component


@Component
class Consumer (private val rabbitTemplate:RabbitTemplate, private val messageRepository: MessageRepository){

    fun init(some:String="default") = println("test: $some")

    @RabbitListener(queues = [STARTING_QUEUE])
    fun consume(messageDTO:MessageDTO) {
        println("message of type ${messageDTO.getType()}")

        runBlocking {
            messageRepository.save(messageDTO)
            if(messageDTO.getType() == "FORWARDABLE") {
                rabbitTemplate.convertAndSend(API_QUEUE)
            }
        }
    }
}