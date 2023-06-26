package com.simform.bank.controller.LoanDept;

import com.simform.bank.entity.dto.CustomerDTO;
import com.simform.bank.service.LoanDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/hdfc")
public class HdfcLoanDeptController {
    @Autowired
    LoanDeptService loanDeptService;
    @RequestMapping("/getUsers")
    public ArrayList<CustomerDTO> getUsers(){
        return loanDeptService.loanForHdfc();
    }
}
