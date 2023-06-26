package com.simform.bank.entity.dto;

import com.simform.bank.entity.Bank;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CustomerDTOMapper implements Function<Bank, CustomerDTO> {
    @Override
    public CustomerDTO apply(Bank bank) {
        return new CustomerDTO(bank.getCustomerId(), bank.getUserName(), bank.getEmailId());
    }
}
