package com.example.bankingapplication.services;

import com.example.bankingapplication.entity.Customer;
import com.example.bankingapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Customer ile ilişkili business layer oluşturuldu.
@Service
public class CustomerService {
    @Autowired // Bir nesnenin otomatik olarak oluşturulmasını ve inject edilmesini sağlar.
    CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer findByIdentityNo(String identityNo) {
        return customerRepository.findByIdentityNo(identityNo);
    }

}
