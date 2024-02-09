package kafka.app.usuarioKafka.service

import kafka.app.usuarioKafka.dto.Usuario
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, Usuario>) {

    /** Log */
    val logger: Logger = LoggerFactory.getLogger(KafkaProducer::class.java)

    /** Constante topic */
    val TOPIC = "mi-tema"

    fun enviarUsuario(usuario: Usuario){
        kafkaTemplate.send(TOPIC, usuario)
        logger.info("Usuario enviado: ${usuario.nombre}")
    }

}