package com.consumer.queueConsumer.repository

import com.consumer.queueConsumer.MessageDTO
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository:ReactiveMongoRepository<MessageDTO, String> {
    suspend fun save(message:MessageDTO)
}