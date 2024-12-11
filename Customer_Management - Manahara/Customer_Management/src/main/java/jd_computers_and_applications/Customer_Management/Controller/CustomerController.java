package jd_computers_and_applications.Customer_Management.Controller;

import jd_computers_and_applications.Customer_Management.Data.CustomerDetails;
import jd_computers_and_applications.Customer_Management.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path = "/customer")
    public List<CustomerDetails> findAllCustomers() {
        return customerService.getAllCustomersDetails();
    }

    @GetMapping(path = "/customer/{customerId}")
    public CustomerDetails findCustomerById(@PathVariable int customerId) {
        return customerService.getCustomerDetailsByCustomerId(customerId);
    }

    @PostMapping(path = "/customer")
    public CustomerDetails saveCustomer(@RequestBody CustomerDetails customerDetails) {
        return customerService.addCustomerDetails(customerDetails);
    }

    @PutMapping(path = "/customer/{customerId}")
    public CustomerDetails updateCustomer(@PathVariable int customerId, @RequestBody CustomerDetails customerDetails) {
        return customerService.updateCustomer(customerId, customerDetails);
    }

    @DeleteMapping(path = "/customer/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId) {
        if (customerId != null){
            customerService.deleteCustomerDetails(customerId);
        }
        else{
            System.out.println("Customer id is null");
        }
    }
}
