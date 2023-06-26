package com.simform.bank.entity.enums;

public enum BankName {
    HDFC("HDFC"), Kotak("KOTAK");
    String bankName;

    BankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
