package com.example.asyncdemo.controller

import com.example.asyncdemo.service.SampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/hello")
    fun hello(): ResponseEntity<String> {
       return ResponseEntity.ok("hello")
    }

    @GetMapping("/heavyHello")
    fun heavyHello(): ResponseEntity<String> {
        // 擬似的に重い処理を実現するために5秒停止させる
        Thread.sleep(5000)
        return ResponseEntity.ok("heavyHello")
    }

    @GetMapping("/asyncHello")
    fun asyncHello(): ResponseEntity<String> {
        sampleService.asyncFunction()
        return ResponseEntity.ok("asyncHello")
    }
}
