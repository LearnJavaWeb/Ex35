package thinhluffy.com.ex35.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.ex35.model.Customer;
import thinhluffy.com.ex35.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
