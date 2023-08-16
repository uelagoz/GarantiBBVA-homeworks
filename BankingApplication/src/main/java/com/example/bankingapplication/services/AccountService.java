package com.example.bankingapplication.services;

import com.example.bankingapplication.entity.Account;
import com.example.bankingapplication.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Account tablosu ile ilişkili business layer oluşturuldu.
@Service
public class AccountService {
    @Autowired // Bir nesnenin otomatik olarak oluşturulmasını ve inject edilmesini sağlar.
    AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public List<Account> findAllAccountsByCustomerId(Long customerId) {
        return accountRepository.findByCustomerId(customerId);
    }

    public void withdrawMoney(String ibanNo, int currentBalance) {
        Account account = accountRepository.findByIbanNo(ibanNo);
        int accountCurrentBalance = account.getCurrentBalance();
        account.setCurrentBalance(accountCurrentBalance - currentBalance);
        accountRepository.flush();
    }

    public void depositMoney(String ibanNo, int currentBalance) {
        Account account = accountRepository.findByIbanNo(ibanNo);
        int accountCurrentBalance = account.getCurrentBalance();
        account.setCurrentBalance(accountCurrentBalance + currentBalance);
        accountRepository.flush();
    }
}
