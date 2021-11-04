package ru.smal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.smal.model.Customer;

@Repository
public interface CustomerRepositories extends JpaRepository<Customer, Long> {

}
