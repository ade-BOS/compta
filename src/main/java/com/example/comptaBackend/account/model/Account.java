package com.example.comptaBackend.account.model;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    public enum Type{

        ACTIF,
        PASSIF,
        PRODUIT,
        CHARGE

    };

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String name;
    String code;
    Type type;
    int balance;

}
