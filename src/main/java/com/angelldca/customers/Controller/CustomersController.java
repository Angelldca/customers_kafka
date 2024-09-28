package com.angelldca.customers.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomersController {



    @GetMapping
    public String getting(){
        return "Hello Kafka + CI/CD";
    }
}
