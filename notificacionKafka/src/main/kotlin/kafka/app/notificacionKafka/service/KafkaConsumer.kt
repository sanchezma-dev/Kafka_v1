package kafka.app.notificacionKafka.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    /** Log */
    val logger: Logger = LoggerFactory.getLogger(KafkaConsumer::class.java)

    @KafkaListener(topics = ["\${spring.kafka.topic.name}"], groupId = "\${spring.kafka.consumer.group-id}")
    fun cosumeMensaje (mensaje: String){
        logger.info("Mensaje recibido: $mensaje")
    }

}