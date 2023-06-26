package com.simform.bank.service;

import com.simform.bank.entity.Bank;
import com.simform.bank.repository.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class BankService {
    public ArrayList<Bank> getCustomerList() {
        return Customer.getCustomerList();
    }

    public ArrayList<Bank> setCustomer(Bank bank) {
        ArrayList<Bank> customers = Customer.getCustomerList();
        customers.add(bank);
        Customer.setCustomerList(customers);
        return customers;
    }

    public ArrayList<Bank> updateCustomer(Bank bank) {
        ArrayList<Bank> customers = Customer.getCustomerList();
        for (Bank customer : customers) {
            if (customer.getCustomerId() == bank.getCustomerId()) {
                customer.setUserName(bank.getUserName());
                customer.setBankName(bank.getBankName());
                customer.setBankManagerId(bank.getBankManagerId());
                customer.setBankManagerName(bank.getBankManagerName());
                customer.setAccountBalance(bank.getAccountBalance());
                break;
            }
        }
        Customer.setCustomerList(customers);
        return customers;
    }

    public ArrayList<Bank> deleteCustomer(int id) {
        ArrayList<Bank> customers = Customer.getCustomerList();
        for (Bank customer : customers) {
            if (customer.getCustomerId() == id) {
                customers.remove(customer);
                break;
            }
        }
        Customer.setCustomerList(customers);
        return customers;
    }
}