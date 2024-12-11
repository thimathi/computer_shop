package jd_computers_and_applications.Salary_Management.Controller;

import jd_computers_and_applications.Salary_Management.Data.PayRollDetails;
import jd_computers_and_applications.Salary_Management.Data.PayRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayRollController {

    @Autowired
    PayRollRepository payRollRepository;

    @GetMapping(path = "/payroll")
    public List<PayRollDetails> getPayRollDetails() {
        return payRollRepository.findAll();
    }

    @GetMapping(path = "/payroll/{payrollId}")
    public PayRollDetails getPayRollDetailsById(@PathVariable int payrollId) {
        return payRollRepository.findById(payrollId).get();
    }

    @PostMapping(path = "/payroll")
    public PayRollDetails createPayRoll(@RequestBody PayRollDetails payRollDetails) {
        return payRollRepository.save(payRollDetails);
    }

    @PutMapping(path = "/payroll/{payrollId}")
    public PayRollDetails updatePayRoll(@PathVariable int payrollId, @RequestBody PayRollDetails payRollDetails) {
        return payRollRepository.findById(payrollId).orElseThrow(() -> new RuntimeException("PayRoll Not Found"));
    }

    @DeleteMapping(path = "/payroll/{payrollId}")
    public void deleteUser(@PathVariable int payrollId) {
        payRollRepository.deleteById(payrollId);
    }
}
