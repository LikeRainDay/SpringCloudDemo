package com.example.configcloudbus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigCloudbusApplication

fun main(args: Array<String>) {
    SpringApplication.run(ConfigCloudbusApplication::class.java, *args)
}
