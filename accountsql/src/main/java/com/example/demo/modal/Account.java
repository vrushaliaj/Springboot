package com.example.demo.modal;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="account")
@Data
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@NotBlank(message="Account cannot be null")
    private String accountName;
    private String bankName;


    public Account(String accountName, String bankName){
        this.accountName= accountName;
        this.bankName = bankName;
    }
}
