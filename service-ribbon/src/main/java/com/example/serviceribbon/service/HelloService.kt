package com.example.serviceribbon.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class HelloService {
    @Autowired
    private lateinit var restTemplate: RestTemplate

    fun helloService(name: String): String {
        return restTemplate.getForObject("http://SERVICE-HI/hello?name=$name",String::class.java)
    }

}