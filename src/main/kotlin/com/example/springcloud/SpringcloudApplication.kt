package com.example.springcloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringcloudApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringcloudApplication::class.java, *args)
}
