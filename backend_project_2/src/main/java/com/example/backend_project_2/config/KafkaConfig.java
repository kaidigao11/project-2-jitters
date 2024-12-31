package com.example.backend_project_2.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic orderDetailTopic() {
        return new NewTopic("order-details", 1, (short) 1);
    }
}
