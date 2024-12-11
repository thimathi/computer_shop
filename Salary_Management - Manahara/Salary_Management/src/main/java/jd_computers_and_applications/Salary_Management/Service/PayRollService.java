package jd_computers_and_applications.Salary_Management.Service;

import jd_computers_and_applications.Salary_Management.Data.PayRollDetails;
import jd_computers_and_applications.Salary_Management.Data.PayRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayRollService {

    @Autowired
    PayRollRepository payRollRepository;

    public List<PayRollDetails> getAllPayRolls() {
        return payRollRepository.findAll();
    }

    public PayRollDetails getPayRollDetails(int id) {
        Optional<PayRollDetails> payRollDetails = payRollRepository.findById(id);
        if (payRollDetails.isPresent()) {
            return payRollDetails.get();
        }
        else{
            return null;
        }
    }

    public void addPayroll(PayRollDetails payRollDetails) {
        payRollRepository.save(payRollDetails);
    }
    public void updatePayroll(int id, PayRollDetails payRollDetails) {
        if (payRollRepository.findById(id).isPresent()) {
            payRollRepository.save(payRollDetails);
        }
        else{
            System.out.println("Payroll not found");
        }
    }
    public void deleteUser(int id) {
        if(payRollRepository.existsById(id)) {
            payRollRepository.deleteById(id);
        }
        else {
            System.out.println("Payroll not found");
        }
    }
}
