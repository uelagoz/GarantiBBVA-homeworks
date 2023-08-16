package com.example.bankingapplication.controller;

import com.example.bankingapplication.dto.AccountDTO;
import com.example.bankingapplication.entity.Account;
import com.example.bankingapplication.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Gelen isteği ilgili servise yönlendirmek için Mapping yapılması gerekiyor. Dolayısıyla Controller sınıfları içinde gerekli
//anotasyonlar kullanılarak mappingler gerçekleştirilir.
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired // Bir nesnenin otomatik olarak oluşturulmasını ve inject edilmesini sağlar.
    AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public void deleteAccount(@RequestBody Long id) {
        accountService.deleteAccount(id);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<Account>> findAllAccountsByCustomerId(@PathVariable Long customerId) {
        List<Account> accountList = accountService.findAllAccountsByCustomerId(customerId);

        if (accountList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(accountList, HttpStatus.OK);
    }

    @PatchMapping("/withdraw/{ibanNo}")
    public void withdrawMoney(@PathVariable String ibanNo, @RequestBody AccountDTO accountDTO) {
        accountService.withdrawMoney(ibanNo, accountDTO.getCurrentBalance());
    }

    @PatchMapping("/deposit/{ibanNo}")
    public void depositMoney(@PathVariable String ibanNo, @RequestBody AccountDTO accountDTO) {
        accountService.depositMoney(ibanNo, accountDTO.getCurrentBalance());
    }
}
