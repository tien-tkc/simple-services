package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloControler() {
    @GetMapping("/")
    fun getResult(): Map<String, String> {
        val result = mutableMapOf<String, String>()
        result["resultCode"] = "200"
        result["resultDesc"] = "hello welcome to simple websevices"

        return result
    }
}