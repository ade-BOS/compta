package com.example.comptaBackend.account.dto.request;

import com.example.comptaBackend.account.model.Account.Type;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

public record AccountRequest
(
    @NotNull
    @NotBlank
    String name,

    @Pattern(regexp = "[0-9]+")
    String code,

    @NotNull
    Type type,

    @PositiveOrZero
    int balance
){}
