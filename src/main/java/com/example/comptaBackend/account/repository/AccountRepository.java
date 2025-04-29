package com.example.comptaBackend.account.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.comptaBackend.account.model.Account;


public interface AccountRepository extends JpaRepository<Account,UUID>{

}
