package com.simform.bank.repository;

import com.simform.bank.entity.Bank;
import com.simform.bank.entity.enums.BankName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
public class Customer {
    @Getter
    @Setter
    private static ArrayList<Bank> customerList = new ArrayList();

    static {
        customerList.add(new Bank(101, "yash", BankName.HDFC, "yash@gmail.com", 8001, "Mihir", 10000, true));
        customerList.add(new Bank(102, "mihir", BankName.HDFC, "mihir@gmail.com", 8001, "Mihir", 15000, true));
        customerList.add(new Bank(201, "hardeek", BankName.Kotak, "hardeek@gmail.com", 4001, "Rakesh", 16000, true));
        customerList.add(new Bank(202, "parth", BankName.Kotak, "parth@gmail.com", 4002, "Mahesh", 5000, false));
    }
}
