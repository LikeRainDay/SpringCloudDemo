package com.example.serviceribbon.controller

import com.example.serviceribbon.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @Autowired
    private lateinit var helloService: HelloService
    @RequestMapping("/hi")
    fun hello(@RequestParam name: String): String {
        return helloService.helloService(name)
    }

}