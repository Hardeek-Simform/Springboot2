package com.simform.bank.entity;

import com.simform.bank.entity.enums.BankName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Bank {
    private int customerId;
    private String userName;
    private BankName bankName;
    private String emailId;
    private int bankManagerId;          // non required data
    private String bankManagerName;     // non required data
    private double accountBalance;      // confidential data
    private boolean kycVerified;        // confidential data
}