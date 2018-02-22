package com.example.servicefeign.controller

import com.example.servicefeign.feign.SchedualServiceHi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HiController {


    @Qualifier(value = "schedualServiceHiHystric")
    @Autowired
    private lateinit var schedualServiceHi: SchedualServiceHi

    @RequestMapping(value = ["/hi"],method = [(RequestMethod.GET)])
    fun sayHi(@RequestParam name: String): String {
        return schedualServiceHi.sayHiFromClientOne(name)
    }



}