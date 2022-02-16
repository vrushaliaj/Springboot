package com.example.demo.server;

import com.example.demo.modal.Account;
import com.example.demo.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServer {
    @Autowired
    AccountRepo accountRepo;

    public List<Account> getAccounts(){
        return accountRepo.findAll();
    }
    public Account createAccounts(Account account){
        Account a=accountRepo.save(new Account(account.getAccountName(), account.getBankName()));
        return a;
    }


}
