package com.ms.user.producers;

import com.ms.user.DTO.EmailDTO;
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
        var emailDTO = new EmailDTO();
        emailDTO.setUserId(userModel.getId());
        emailDTO.setEmailTo(userModel.getEmail());
        emailDTO.setSubject("cadastro realizado com sucesso!");
        emailDTO.setText(userModel.getName()+"Aproveite");


        //COMO SERA UTILIZADO EXCHANGE DEFAULT, BASTA ADICIONAR UMA STRING VAZIA
        //ADICIONANDO TAMBEM A ROUTINGKEY
        //ADICIONANDO TAMBEM A MENSAGEM
        rabbitTemplate.convertAndSend("",routingkey,emailDTO);

    }



}
