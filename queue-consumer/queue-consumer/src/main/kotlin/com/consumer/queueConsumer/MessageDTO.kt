package com.consumer.queueConsumer

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDTO (@JsonProperty("type") private var type:String,
                       @JsonProperty("stock") private var stock:Int,
                       @JsonProperty("preferences") private var preferences:IntArray){

    fun getType():String = this.type
    fun setType(name:String) { this.type = name }

    fun getStock():Int = this.stock
    fun setStock(stock:Int) { this.stock = stock }

    fun getPreferences():IntArray = this.preferences
    fun setPreferences(preferences:IntArray) { this.preferences = preferences }
}