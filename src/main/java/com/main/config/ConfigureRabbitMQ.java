/**
 * Works Cited:
 * https://www.youtube.com/watch?v=WzO6_4jeliM
 *  https://www.youtube.com/watch?v=0BOm7PbriD8 = How to implement RabbitMq in Spring Boot
 * */

package com.main.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureRabbitMQ {

    @Bean
    Queue createQueue() {
        return new Queue("hello", false);
    }

    /*@Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    Binding binding(Queue q, TopicExchange exchange) {
        return BindingBuilder.bind(q).to(exchange).with("hello");
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory
            , MessageListenerAdapter messageListenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
    }*/
}
