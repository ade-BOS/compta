package com.example.comptaBackend.account.service;

import org.springframework.stereotype.Service;

import com.example.comptaBackend.account.dto.request.AccountRequest;
import com.example.comptaBackend.account.model.Account;
import com.example.comptaBackend.account.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account create(AccountRequest accountRequest){

        Account account = Account.builder()
            .name(accountRequest.name())
            .code(accountRequest.code())
            .type(accountRequest.type())
            .balance(accountRequest.balance())
            .build();

        return accountRepository.save(account);
    }

}
