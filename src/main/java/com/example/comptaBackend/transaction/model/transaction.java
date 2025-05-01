package com.example.comptaBackend.transaction.model;

import java.util.Date;
import java.util.UUID;

import com.example.comptaBackend.account.model.Account;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    Date date;

    String description;

    @ManyToOne
    Account debitAccount;

    @ManyToOne
    Account creditAccount;

    int amount;

}
