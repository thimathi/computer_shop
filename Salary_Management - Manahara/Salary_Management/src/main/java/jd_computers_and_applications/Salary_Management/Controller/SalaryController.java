package jd_computers_and_applications.Salary_Management.Controller;

import jd_computers_and_applications.Salary_Management.Data.SalaryDetails;
import jd_computers_and_applications.Salary_Management.Data.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    SalaryRepository salaryRepository;

    @GetMapping(path = "/salary")
    public List<SalaryDetails> getSalary() {
        return salaryRepository.findAll();
    }

    @GetMapping(path = "/salary/{salaryId}")
    public SalaryDetails getSalary(@PathVariable int salaryId) {
        return salaryRepository.findById(salaryId).get();
    }

    @PostMapping(path = "/salary")
    public SalaryDetails createSalary(@RequestBody SalaryDetails salaryDetails) {
        return salaryRepository.save(salaryDetails);
    }

    @PutMapping(path = "/salary/{salaryId}")
    public SalaryDetails updateSalary(@PathVariable int salaryId, @RequestBody SalaryDetails salaryDetails) {
        return salaryRepository.findById(salaryId).orElseThrow(() -> new RuntimeException("Salary Not Found"));
    }

    @DeleteMapping(path = "/salary/{salaryId}")
    public void deleteSalary(@PathVariable int salaryId) {
        salaryRepository.deleteById(salaryId);
    }
}
