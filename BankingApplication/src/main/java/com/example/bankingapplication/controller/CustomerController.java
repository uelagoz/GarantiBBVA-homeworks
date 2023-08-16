package com.example.bankingapplication.controller;

import com.example.bankingapplication.entity.Customer;
import com.example.bankingapplication.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//Gelen isteği ilgili servise yönlendirmek için Mapping yapılması gerekiyor. Dolayısıyla Controller sınıfları içinde gerekli
//anotasyonlar kullanılarak mappingler gerçekleştirilir.
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired // Bir nesnenin otomatik olarak oluşturulmasını ve inject edilmesini sağlar.
    CustomerService customerService;

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);

        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/identity/{identityNo}")
    public ResponseEntity<Customer> findByIdentityNo(@PathVariable String identityNo) {
        Customer customer = customerService.findByIdentityNo(identityNo);

        if (customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
