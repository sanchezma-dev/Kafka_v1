package kafka.app.notificacionKafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfigConsumer {

    @Value("\${spring.kafka.topic.name}")
    private lateinit var topicName: String

        @Bean
    fun miTopic_01(): NewTopic{
        return TopicBuilder.name(topicName)
            .build()
    }
}