package thinhluffy.com.ex35.service;

import thinhluffy.com.ex35.model.Customer;
import thinhluffy.com.ex35.model.Province;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
