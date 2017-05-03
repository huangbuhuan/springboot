package me.buhuan.rabbbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/2下午5:23
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("queue");
    }

}
