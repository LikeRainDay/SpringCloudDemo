package com.example.servicefeign.component

import com.example.servicefeign.feign.SchedualServiceHi
import org.springframework.stereotype.Component


@Component
class SchedualServiceHiHystric :SchedualServiceHi{
    override fun sayHiFromClientOne(name: String): String {
        return "sorry $name"
    }

}