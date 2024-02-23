package kafka.app.usuarioKafka.controller

import kafka.app.usuarioKafka.service.KafkaProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafkaProducer")
class UsuarioController {

    @Autowired
    private lateinit var kafkaProducer: KafkaProducer

    @GetMapping("/envioMensaje")
    fun envioMensaje(@RequestParam message: String): ResponseEntity<String> {
        kafkaProducer.envioMensaje(message)
        return ResponseEntity.ok("Mensaje enviado con su topic")
    }
}