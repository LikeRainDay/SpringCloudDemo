package com.example.servicezuul.compent

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import javax.validation.constraints.Null

@Component
class MyFilter: ZuulFilter() {

    companion object {
        private val log =LoggerFactory.getLogger(MyFilter::class.java)
    }

    override fun run(): Any? {
        val currentContext = RequestContext.getCurrentContext()
        val request = currentContext.request
        log.info("${request.method} >>> ${request.requestURL}")
        val accessToken  = request.getParameter("token")
        if (accessToken == null) {
            log.warn("token is empty")
            currentContext.setSendZuulResponse(false)
            currentContext.responseStatusCode = 401
            try {
                currentContext.response.writer.write("token is empty")
            } catch (e: Exception) {

            }
            return null
        }
        log.info("ok")
        return null
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun filterType(): String {
        return "pre"
    }

    override fun filterOrder(): Int {
        return 0
    }


}