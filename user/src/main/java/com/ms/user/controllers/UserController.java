package com.ms.user.controllers;

import com.ms.user.DTO.UserRecordDTO;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;



    @PostMapping
    public ResponseEntity<UserModel> criarUser(@RequestBody @Valid UserRecordDTO userDTO){
    var userModel = new UserModel();
        BeanUtils.copyProperties(userDTO, userModel); //COPIA AS PROPRIEDADES

        service.criarUser(userModel);

    return ResponseEntity.status(HttpStatus.CREATED).body(userModel);

    }
}