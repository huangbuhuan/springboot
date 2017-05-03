package me.buhuan.rabbbit;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/2下午5:22
 */
@Component
public class Receiver {

    @RabbitListener(queues = "hello")
    public void process(String hello) {
        System.out.println("Receiver:" + hello);
    }

}
