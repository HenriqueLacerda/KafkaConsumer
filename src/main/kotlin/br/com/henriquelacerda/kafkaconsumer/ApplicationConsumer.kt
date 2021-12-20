package br.com.henriquelacerda.kafkaconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties(CustomConfigs::class)
open class ApplicationConsumer

fun main(args: Array<String>) {
    runApplication<ApplicationConsumer>(*args)
}