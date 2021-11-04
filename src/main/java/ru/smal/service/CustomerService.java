package ru.smal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.smal.model.Customer;
import ru.smal.repository.CustomerRepositories;

import java.util.List;

@Service(value = "customerService")
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepositories customerRepository;

    public CustomerService(CustomerRepositories customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer getById(Long id) {
        final Customer customer = customerRepository.findById(id).orElse(null);
        logger.info("Customer successfully loaded: Customer details: " + customer);
        return customer;
    }

    @Transactional
    public List<Customer> findAll() {
        final List<Customer> customers = customerRepository.findAll();
        customers.forEach(book -> logger.info("Book list: " + book));
        return customers;
    }

    @Transactional
    public Customer save(Customer customer) {
        final Customer customerBase = customerRepository.save(customer);
        logger.info("Customer successfully saved: Customer details: " + customerBase);
        return customerBase;
    }

    @Transactional
    public Customer update(Customer customer) {
        final Customer customerBase = customerRepository.save(customer);
        logger.info("Customer successfully updated: Customer details: " + customerBase);
        return customerBase;
    }

    @Transactional
    public void deleteById(Long id) {
        final Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            customerRepository.deleteById(id);
        }
        logger.info("Customer successfully deleted: Customer details: " + customer);
    }
}
