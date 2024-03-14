package com.ms.email.consumer;

import com.ms.email.dtos.EmailRecordDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}") //PEGANDO O NOME DA FILA QUE IRA CONSUMIR
    public void listerEmailQueue(@Payload EmailRecordDTO emailRecordDTO){//ANOTAÇÃO PAYLOAD PARA RECEBER A MENSAGEM

        System.out.println(emailRecordDTO.emailTo());
    }



}
