package kafka.app.usuarioKafka.controller

import kafka.app.usuarioKafka.dto.Usuario
import kafka.app.usuarioKafka.service.KafkaProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafkaProducer")
class UsuarioController {

    @Autowired
    private lateinit var service: KafkaProducer

    @PostMapping("/enviarUsuario")
    fun enviarUsuario(@RequestBody usuario: Usuario): String {
        service.enviarUsuario(usuario)
        return "Usuario enviado correctamente"
    }


}