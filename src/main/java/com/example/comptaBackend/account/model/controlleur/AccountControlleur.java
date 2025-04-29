package com.example.comptaBackend.account.model.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comptaBackend.account.dto.request.AccountRequest;
import com.example.comptaBackend.account.model.Account;
import com.example.comptaBackend.account.service.AccountService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("account")
@AllArgsConstructor
public class AccountControlleur {

    AccountService accountService;

    @PostMapping
    Account newAccount(AccountRequest accountRequest){
        return accountService.create(accountRequest);
    }

}
