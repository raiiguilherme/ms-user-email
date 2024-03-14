package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserProducer userProducer;

    @Transactional //GARANTE QUE ACONTEÇA UM ROLLBACK CASO ALGUMA OPERAÇÃO FALHE
    public UserModel criarUser(UserModel user){
        user = repository.save(user); //PRIMEIRO SALVANDO
        userProducer.pushMessageEmail(user); //DEPOIS ENVIANDO O EMAIL
       return user; //RETORNANDO O USUARIO

    }

}
