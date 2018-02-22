package com.example.servicefeign.feign

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam


@FeignClient(value = "service-hi")
interface SchedualServiceHi {
    // 这里的/hello 是你注册的Eureka中的生命接口
    @RequestMapping(value = ["/hello"], method = [(RequestMethod.GET)])
    fun sayHiFromClientOne(@RequestParam(value = "name") name:String): String
}
