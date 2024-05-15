package aze.coders.springbootdatarest.repository;

import aze.coders.springbootdatarest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "cust")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByName(String name);
}
