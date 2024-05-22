package org.example.customermanagement.repository;

import org.example.customermanagement.model.Customer;
import org.example.customermanagement.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
