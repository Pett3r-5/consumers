package com.consumer.queueConsumer

import org.springframework.stereotype.Component

@Component
class Consumer {

    constructor(){
        init();
        init("oioi");
    }

    fun init(some:String="default"):String {
        System.out.println("aa: $some")
        return "";
    }
}