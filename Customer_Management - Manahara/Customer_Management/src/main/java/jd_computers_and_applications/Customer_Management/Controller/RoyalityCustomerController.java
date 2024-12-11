package jd_computers_and_applications.Customer_Management.Controller;


import jd_computers_and_applications.Customer_Management.Data.RoyalityCustomerDetails;
import jd_computers_and_applications.Customer_Management.Service.RoyalityCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoyalityCustomerController {

    @Autowired
    RoyalityCustomerService royalityCustomerService;

    @GetMapping(path = "/customer/royalityCustomer")
    public List<RoyalityCustomerDetails> getRoyalityCustomer() {
        return royalityCustomerService.getRoyalityCustomers();
    }

    @GetMapping(path = "/customer/royalityCustomer/{customerId}")
    public RoyalityCustomerDetails findRoyalityCustomer(@PathVariable int customerId) {
        return royalityCustomerService.getRoyalityCustomerById(customerId);
    }

    @PostMapping(path = "/customer/royalityCustomer")
    public RoyalityCustomerDetails addCustomer(@RequestBody RoyalityCustomerDetails royalityCustomerDetails) {
        return royalityCustomerService.createRoyalityCustomer(royalityCustomerDetails);
    }

    @PutMapping(path = "/customer/royalityCustomer/{customerId}")
    public RoyalityCustomerDetails updateCustomer(@PathVariable int customerId, @RequestBody RoyalityCustomerDetails royalityCustomerDetails) {
        return royalityCustomerService.updateRoyalityCustomer(customerId, royalityCustomerDetails);
    }

    @DeleteMapping(path = "/customer/royalityCustomer/{customerId}")
    public void deleteCustomer(@PathVariable int customerId) {
        royalityCustomerService.deleteRoyalityCustomer(customerId);
    }
}

