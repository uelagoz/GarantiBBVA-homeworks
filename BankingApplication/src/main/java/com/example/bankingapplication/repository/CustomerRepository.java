package com.example.bankingapplication.repository;

import com.example.bankingapplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Gerekli CRUD işlemlerini gerçekleştirebilmek için JpaRepositery extend edildi.
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByIdentityNo(String identityNo);

    @Query("select c from Customer c where c.email = :email") //Tabloda email ile arama yapılmak istendiğinde çalıştırılacak olan SQL sorgusu
    List<Customer> findByEmail(String email);
}
