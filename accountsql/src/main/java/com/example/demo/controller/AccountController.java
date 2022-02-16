package com.example.demo.controller;

import com.example.demo.modal.Account;
import com.example.demo.server.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountServer accountServer;

    @GetMapping("/getAccounts")
    public List<Account> getAccounts(){
        return accountServer.getAccounts();
    }

    @PostMapping("/createAccounts")
    public Account createAccounts(@RequestBody Account account){
        Account a=accountServer.createAccounts(account);
        return a;
    }
}
