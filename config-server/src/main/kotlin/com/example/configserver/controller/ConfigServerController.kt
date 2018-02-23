package com.example.configserver.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ConfigServerController {


    @Value("\${good}")
    private lateinit var  hello:String

    @RequestMapping("/hi")
    fun hi(): String {
        return hello
    }


}