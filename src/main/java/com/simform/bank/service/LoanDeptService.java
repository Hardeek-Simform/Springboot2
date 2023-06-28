package com.simform.bank.service;

import com.simform.bank.entity.Bank;
import com.simform.bank.entity.dto.CustomerDTO;
import com.simform.bank.entity.dto.CustomerDTOMapper;
import com.simform.bank.entity.enums.BankName;
import com.simform.bank.repository.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class LoanDeptService {
    @Autowired
    private CustomerDTOMapper customerDTOMapper;

    public ArrayList<CustomerDTO> loanForHdfc() {
        ArrayList<Bank> customers = Customer.getCustomerList();
        ArrayList<CustomerDTO> dtoList = (ArrayList<CustomerDTO>) customers.stream().filter(e -> e.getBankName() == BankName.HDFC).map(customerDTOMapper).collect(Collectors.toList());
        return dtoList;
    }

    public ArrayList<CustomerDTO> loanForKotak() {
        ArrayList<Bank> customers = Customer.getCustomerList();
        ArrayList<CustomerDTO> dtoList = (ArrayList<CustomerDTO>) customers.stream().filter(e -> e.getBankName() == BankName.Kotak).map(customerDTOMapper).collect(Collectors.toList());
        return dtoList;
    }
}
