package com.consumer.queueConsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QueueConsumerApplication

fun main(args: Array<String>) {
	runApplication<QueueConsumerApplication>(*args)
}
