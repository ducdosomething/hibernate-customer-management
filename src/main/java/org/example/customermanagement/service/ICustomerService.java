package org.example.customermanagement.service;

import org.example.customermanagement.model.Customer;
import org.example.customermanagement.model.Province;

import java.util.List;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
