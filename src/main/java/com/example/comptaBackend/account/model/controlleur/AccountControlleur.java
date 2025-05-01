package com.example.comptaBackend.account.model.controlleur;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comptaBackend.account.dto.request.AccountRequest;
import com.example.comptaBackend.account.model.Account;
import com.example.comptaBackend.account.service.AccountService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("account")
@AllArgsConstructor
public class AccountControlleur {

    AccountService accountService;

    @PostMapping
    Account newAccount(AccountRequest accountRequest){
        return accountService.create(accountRequest);
    }
    @GetMapping
    public List<Account> getAll() {
        return accountService.findAll();
    }
    @GetMapping("/{id}")
    Account getOne(@PathVariable UUID id){

        return accountService.findOne(id);
    }
    @PutMapping("/{id}")
    public Account update(@PathVariable UUID id,AccountRequest accountRequest) {
        
        return accountService.update(id, accountRequest);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable UUID id){
        accountService.remove(id);
    }
    
    

}
