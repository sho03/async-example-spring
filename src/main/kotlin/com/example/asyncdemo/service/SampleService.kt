package com.example.asyncdemo.service

import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class SampleService {

    @Async
    fun asyncFunction() {
        println("======================================")
        println("Start async function!")
        println("======================================")
        Thread.sleep(5000)
        println("======================================")
        println("End async function!")
        println("======================================")
    }
}