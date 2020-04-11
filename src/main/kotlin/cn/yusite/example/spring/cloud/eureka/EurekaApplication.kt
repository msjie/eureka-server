package cn.yusite.example.spring.cloud.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaApplication

fun main(args: Array<String>) {
	runApplication<EurekaApplication>(*args)
}
