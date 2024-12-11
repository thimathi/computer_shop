package jd_computers_and_applications.Customer_Management.Service;

import jd_computers_and_applications.Customer_Management.Data.RegularCustomerDetails;
import jd_computers_and_applications.Customer_Management.Data.RegularCustomerRepository;
import jd_computers_and_applications.Customer_Management.Data.RoyalityCustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegularCustomerService {

    @Autowired
    private RegularCustomerRepository regularCustomerRepository;

    public List<RegularCustomerDetails> getRegularCustomerDetails() {

        return regularCustomerRepository.findAll();
    }

    public RegularCustomerDetails getRegularCustomerDetailsByCustomerId(int id) {
        Optional<RegularCustomerDetails> regularCustomerDetails = regularCustomerRepository.findById(id);
        if (regularCustomerDetails.isPresent()) {
            return regularCustomerDetails.get();
        }
        return null;
    }

    public RegularCustomerDetails addRegularCustomerDetails(RegularCustomerDetails regularCustomerDetails) {
        return regularCustomerRepository.save(regularCustomerDetails);
    }

    public RegularCustomerDetails updateRegularCustomer(int id, RegularCustomerDetails customerDetails) {
        if (regularCustomerRepository.existsById(id)) {
            return regularCustomerRepository.save(customerDetails);
        }
        else{
            return null;
        }
    }

    public void deleteRegularCustomerDetails(int id) {
        if (regularCustomerRepository.existsById(id)) {
            regularCustomerRepository.deleteById(id);
        }
        else {
            System.out.println("Regular customer details not found");
        }
    }
}
