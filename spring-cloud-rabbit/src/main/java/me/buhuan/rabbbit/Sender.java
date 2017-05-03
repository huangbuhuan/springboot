package me.buhuan.rabbbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/2下午5:19
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("send: ..........");
        amqpTemplate.convertAndSend("hello", context);
    }
}
