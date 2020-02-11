package me.tinnan.aws.xraydaemontest02.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{id}")
    public CustomerResponse getCustomer(@PathVariable int id) {
        Customer c = customerService.getCustomerById(id);
        CustomerResponse customer = new CustomerResponse();
        customer.setId(c.getId());
        customer.setFirstName(c.getFirstName());
        customer.setLastName(c.getLastName());
        customer.setEmail(c.getEmail());
        return customer;
    }
}
