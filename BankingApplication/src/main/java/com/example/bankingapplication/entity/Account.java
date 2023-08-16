package com.example.bankingapplication.entity;

import com.example.bankingapplication.enums.AccountType;
import com.example.bankingapplication.enums.CurrencyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ACCOUNT")
//Account veritabanında ACCOUNT ile ilişkilendirilecek olan entity.
public class Account {
    @Id //Her entity için bir @Id tanımlanmalıdır.
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long accountId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) //Birden fazla Account bir Customer için assign edilebileceğinden dolayı
                                                        //ManyToOne ilişkisi kuruldu.
    @JoinColumn(name = "customer_id")//ACCOUNT tablosunda yer alacak foreign_key ismi customer_id olarak belirlendi.
    @JsonIgnore
    private Customer customer;

    String ibanNo;
    int currentBalance;

    @Enumerated(EnumType.STRING) //Enum tipinin numerik değeri yerine yazı ile tabloya kaydedilmesi için eklendi.
    AccountType accountType;

    @Enumerated(EnumType.STRING)
    CurrencyType currencyType;

}
