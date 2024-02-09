package kafka.app.usuarioKafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UsuarioKafkaApplication

fun main(args: Array<String>) {
	runApplication<UsuarioKafkaApplication>(*args)
}
