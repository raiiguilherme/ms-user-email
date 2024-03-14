package com.ms.user.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record UserRecordDTO( //UTILIZANDO RECORD PARA PROTEGER AS REGRAS DE NEGOCIO
        @NotBlank   //VALIDANDO PARA QUE NAO VENHA VAZIO
        String nome,
        @NotBlank @Email //VALIDANDO A FORMATAÇÃO DE EMAIL E PARA QUE NAO VENHA VAZIO
        String email
) {
}
