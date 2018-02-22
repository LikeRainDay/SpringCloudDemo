package com.example.servicezuul

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
class ServiceZuulApplication

fun main(args: Array<String>) {
    SpringApplication.run(ServiceZuulApplication::class.java, *args)
}
