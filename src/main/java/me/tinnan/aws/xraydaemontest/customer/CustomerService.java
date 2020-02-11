package me.tinnan.aws.xraydaemontest.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    public Customer getCustomerById(int id) {
        Optional<Customer> it = customerRepo.findById(id);
        if (it.isPresent()) {
            return it.get();
        }

        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("Customer First name " + id);
        customer.setLastName("Customer Last name " + id);
        customer.setEmail("Customer Email " + id);
        customerRepo.save(customer);

        return customer;
    }
}
