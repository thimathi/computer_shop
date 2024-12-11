package jd_computers_and_applications.Customer_Management.Service;

import jd_computers_and_applications.Customer_Management.Data.CustomerDetails;
import jd_computers_and_applications.Customer_Management.Data.CustomerRepository;
import jd_computers_and_applications.Customer_Management.Data.RoyalityCustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDetails> getAllCustomersDetails() {
        return customerRepository.findAll();
    }

    public CustomerDetails getCustomerDetailsByCustomerId(int customerId) {
        Optional<CustomerDetails> customerDetails = customerRepository.findById(customerId);
        if(customerDetails.isPresent()) {
            return customerDetails.get();
        }
        return null;
    }

    public CustomerDetails addCustomerDetails(CustomerDetails customerDetails) {
        return customerRepository.save(customerDetails);
    }

    public CustomerDetails updateCustomer(int id, CustomerDetails customerDetails) {
        if (customerRepository.existsById(id)) {
            return customerRepository.save(customerDetails);
        }
        else {
            return null;
        }
    }

    public void deleteCustomerDetails(int customerId) {
        if(customerRepository.findById(customerId).isPresent()) {
            customerRepository.deleteById(customerId);
        }
        else {
            System.out.println("Customer not found");
        }
    }
}
