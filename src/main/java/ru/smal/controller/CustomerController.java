package ru.smal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.smal.service.CustomerService;

@Controller
@EnableWebMvc
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer/{id}")
    public String showCustomerById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("message", customerService.getById(id));
        return "index";
    }

    @GetMapping("/customers")
    public String showCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers";
    }


}
