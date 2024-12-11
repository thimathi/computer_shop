package jd_computers_and_applications.Customer_Management.Service;

import jd_computers_and_applications.Customer_Management.Data.RoyalityCustomerDetails;
import jd_computers_and_applications.Customer_Management.Data.RoyalityCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoyalityCustomerService {

    @Autowired
    RoyalityCustomerRepository royalityCustomerRepository;

    public List<RoyalityCustomerDetails> getRoyalityCustomers() {
        return royalityCustomerRepository.findAll();
    }

    public RoyalityCustomerDetails getRoyalityCustomerById(int id) {
        Optional<RoyalityCustomerDetails> customerDetails = royalityCustomerRepository.findById(id);
        if (customerDetails.isPresent()) {
            return customerDetails.get();
        }
        else{
            return null;
        }
    }

    public RoyalityCustomerDetails createRoyalityCustomer(RoyalityCustomerDetails customerDetails) {
        return royalityCustomerRepository.save(customerDetails);
    }

    public RoyalityCustomerDetails updateRoyalityCustomer(int id, RoyalityCustomerDetails customerDetails) {
        if (royalityCustomerRepository.existsById(id)) {
            return royalityCustomerRepository.save(customerDetails);
        }
        else{
            return null;
        }
    }

    public void deleteRoyalityCustomer(int id) {
        if (royalityCustomerRepository.existsById(id)) {
            royalityCustomerRepository.deleteById(id);
        }
        else{
            System.out.println("Customer not found");
        }
    }


}
