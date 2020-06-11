package com.consumer.queueConsumer

class MessageDTO (private var type:String, private var stock:Int, private var preferences:IntArray){
    fun getType():String = this.type
    fun setType(name:String) { this.type = name }

    fun getStock():Int = this.stock
    fun setStock(stock:Int) { this.stock = stock }

    fun getPreferences():IntArray = this.preferences
    fun setPreferences(preferences:IntArray) { this.preferences = preferences }
}