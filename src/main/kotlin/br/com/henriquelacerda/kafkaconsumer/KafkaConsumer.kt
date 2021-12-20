package br.com.henriquelacerda.kafkaconsumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)
    @KafkaListener(topics = ["topic-backup"], groupId = "simple-kotlin-consumer")
    fun processMessage(message: String) {
        logger.info("Consumindo da Fila: {}", message)
    }

}