package com.example.bankingapplication.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "CUSTOMER")
//Customer veritabanında CUSTOMER ile ilişkilendirilecek olan entity.
public class Customer {
    @Id //Her entity için bir @Id tanımlanmalıdır.
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String surname;
    String identityNo;
    String password;
    String email;
    String phoneNumber;

    @OneToMany(mappedBy = "customer")// Bir Customer a ait birden fazla Account olabileceğinden dolayı OneToMany ilişkisi kuruldu.
    private List<Account> accountList;
}
