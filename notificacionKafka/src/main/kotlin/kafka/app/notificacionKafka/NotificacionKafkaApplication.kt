package kafka.app.notificacionKafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotificacionKafkaApplication

fun main(args: Array<String>) {
	runApplication<NotificacionKafkaApplication>(*args)
}

