package jd_computers_and_applications.Customer_Management.Controller;

import jd_computers_and_applications.Customer_Management.Data.RegularCustomerDetails;
import jd_computers_and_applications.Customer_Management.Service.RegularCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegularCustomerController {

    @Autowired
    RegularCustomerService regularCustomerService;

    @GetMapping(path = "/customer/regularCustomer")
    public List<RegularCustomerDetails> findAllRegularCustomers() {
        return regularCustomerService.getRegularCustomerDetails();
    }

    @GetMapping(path = "/customer/regularCustomer/{customerId}")
    public RegularCustomerDetails findRegularCustomer(@PathVariable int customerId) {
        return regularCustomerService.getRegularCustomerDetailsByCustomerId(customerId);
    }

    @PostMapping(path = "/customer/regularCustomer")
    public RegularCustomerDetails saveRegularCustomer(@RequestBody RegularCustomerDetails regularCustomerDetails) {
        return regularCustomerService.addRegularCustomerDetails(regularCustomerDetails);
    }

    @PutMapping(path = "/customer/regularCustomer/{customerId}")
    public RegularCustomerDetails updateRegularCustomer(@PathVariable int customerId, @RequestBody RegularCustomerDetails regularCustomerDetails) {
        return regularCustomerService.updateRegularCustomer(customerId, regularCustomerDetails);
    }

    @DeleteMapping(path = "/customer/regularCustomer/{customerId}")
    public void deleteRegularCustomer(@PathVariable Integer customerId) {
        if (customerId != null){
            regularCustomerService.deleteRegularCustomerDetails(customerId);
        }
        else {
            System.out.println("Customer id is null");
        }
    }
}
