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

    @GetMapping("/list")
    public ArrayList<Bank> displayAllUsers() {
        return bankService.getCustomerList();
    }

    @PostMapping("/add")
    public ArrayList<Bank> addUser(@RequestBody Bank bank) {
        ArrayList<Bank> updatedList = bankService.setCustomer(bank);
        return updatedList;
    }

    @PutMapping("/update")
    public ArrayList<Bank> updateUser(@RequestBody Bank bank) {
        ArrayList<Bank> updatedList = bankService.updateCustomer(bank);
        return updatedList;
    }

    @DeleteMapping("/delete/{id}")
    public ArrayList<Bank> deleteUser(@PathVariable("id") int id) {
        ArrayList<Bank> updatedList = bankService.deleteCustomer(id);
        return updatedList;
    }
}
