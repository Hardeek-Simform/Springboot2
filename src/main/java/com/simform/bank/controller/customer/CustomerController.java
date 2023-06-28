package com.simform.bank.controller.customer;

import com.simform.bank.entity.Bank;
import com.simform.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/bankCustomer")
public class CustomerController {
    @Autowired
    private BankService bankService;

    @GetMapping
    public ArrayList<Bank> displayAllUsers() {
        return bankService.getCustomerList();
    }

    @PostMapping
    public ArrayList<Bank> addUser(@RequestBody Bank bank) {
        ArrayList<Bank> updatedList = bankService.setCustomer(bank);
        return updatedList;
    }

    @PutMapping
    public ArrayList<Bank> updateUser(@RequestBody Bank bank) {
        ArrayList<Bank> updatedList = bankService.updateCustomer(bank);
        return updatedList;
    }

    @DeleteMapping("/{id}")
    public ArrayList<Bank> deleteUserById(@PathVariable("id") int id) {
        ArrayList<Bank> updatedList = bankService.deleteCustomer(id);
        return updatedList;
    }
}
