package kafka.app.usuarioKafka.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer {

    /** Log */
    val logger: Logger = LoggerFactory.getLogger(KafkaProducer::class.java)

    /** Propiedad topic */
    @Value("\${spring.kafka.topic.name}")
    private lateinit var topicName: String

    /** KafkaTemplate */
    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, String>

    fun envioMensaje(message: String){
        logger.info("Mensaje enviado: $message")
        kafkaTemplate.send(topicName, message)
    }

}