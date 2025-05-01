package com.example.comptaBackend.account.service;

import java.util.List;
import java.util.UUID;

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
    public List<Account> findAll(){

        return accountRepository.findAll();
        
    }
    public Account findOne(UUID accountId){
        return accountRepository.findById(accountId).get();
    }
    public Account update(UUID accountId, AccountRequest accountRequest){

        Account account = Account.builder()
            .id(accountId)
            .name(accountRequest.name())
            .code(accountRequest.code())
            .type(accountRequest.type())
            .balance(accountRequest.balance())
            .build();

        return accountRepository.save(account);

        
    }
    public void remove(UUID accountId){

        accountRepository.deleteById(accountId);
    }

}
