package com.github.ftoresan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * Created by fabricio on 19/05/16.
 */
@SpringBootApplication
open class Application

fun main(args : Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}