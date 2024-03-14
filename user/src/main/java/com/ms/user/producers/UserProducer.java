package com.ms.user.producers;

import com.ms.user.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer { //AQUI EU CRIO A MENSAGEM QUE SERA ESCUTADA PELO MS DE EMAIL

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${broker.queue.email.name}")
    private String routingkey;

    public void pushMessageEmail(UserModel userModel){
        

    }



}
