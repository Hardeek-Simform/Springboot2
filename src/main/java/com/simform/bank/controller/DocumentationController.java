package com.simform.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DocumentationController {
    @GetMapping("")
    @ResponseBody
    public String homePage() {
        return "<h1>Documentation</h1>" +
                "To check about page : <a href=\"http://localhost:8080/home/about\">http://localhost:8080/home/about</a>" +
                "<br/><br/><h3>Bank Customer's services:</h3>" +
                "Get all customer's list: <a href=\"http://localhost:8080/bankCustomer/list\">http://localhost:8080/bankCustomer/list</a>" +
                "<br/>add new customer in list: <a href=\"http://localhost:8080/bankCustomer/add\">http://localhost:8080/bankCustomer/add</a>" +
                "<br/>Update existing customer's list: <a href=\"http://localhost:8080/bankCustomer/update\">http://localhost:8080/bankCustomer/update</a>" +
                "<br/>Delete customer: <a href=\"http://localhost:8080/bankCustomer/delete/101\">http://localhost:8080/bankCustomer/delete/101</a>  pass any id at place of 101 to delete"+
                "<br/><br/><h3>Loan department services (For contacting users):</h3>" +
                "get HDFC user's details: <a href=\"http://localhost:8080/hdfc/getUsers\">http://localhost:8080/bankCustomer/hdfc/getUsers</a>" +
                "<br/>get Kotak user's details: <a href=\"http://localhost:8080/bankCustomer/kotak/getUsers\">http://localhost:8080/bankCustomer/kotak/getUsers</a>";
    }

    @GetMapping("/about")
    @ResponseBody
    public String aboutPage() {
        return "<h1><center>About us </center></h1><br/><br/>" +
                "<h3>Name : Hardeek Bhatia</h3>" +
                "<h3>College name : Aditya Silver Oak Institute of Technology(ASOIT) " +
                "<h3>Comapny : Simform Solutions LLP</h3></br>";
    }
}

