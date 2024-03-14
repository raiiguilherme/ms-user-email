package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Transactional //GARANTE QUE ACONTEÇA UM ROLLBACK CASO ALGUMA OPERAÇÃO FALHE
    public UserModel criarUser(UserModel user){

       return repository.save(user);

    }

}
