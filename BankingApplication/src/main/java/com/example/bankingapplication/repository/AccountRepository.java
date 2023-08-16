package com.example.bankingapplication.repository;

import com.example.bankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Gerekli CRUD işlemlerini gerçekleştirebilmek için JpaRepositery extend edildi.
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByCustomerId(Long identityNo);

    @Query("select a from Account a where a.ibanNo = :ibanNo") //Tabloda ibanNo ile arama yapılmak istendiğinde çalıştırılacak olan SQL sorgusu
    Account findByIbanNo(String ibanNo);
}
