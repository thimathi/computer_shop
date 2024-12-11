package jd_computers_and_applications.Salary_Management.Service;

import jd_computers_and_applications.Salary_Management.Data.SalaryDetails;
import jd_computers_and_applications.Salary_Management.Data.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {

    @Autowired
    SalaryRepository salaryRepository;

    public List<SalaryDetails> getAllSalary() {
        return salaryRepository.findAll();
    }

    public SalaryDetails getSalaryDetails(int id) {
        Optional<SalaryDetails> salaryDetails = salaryRepository.findById(id);
        if (salaryDetails.isPresent()) {
            return salaryDetails.get();
        }
        else{
            return null;
        }
    }

    public void addSalary(SalaryDetails salaryDetails) {
        salaryRepository.save(salaryDetails);
    }
    public void updateSalary(int id, SalaryDetails salaryDetails) {
        if (salaryRepository.findById(id).isPresent()) {
            salaryRepository.save(salaryDetails);
        }
        else{
            System.out.println("Salary not found");
        }
    }
    public void deleteSalary(int id) {
        if(salaryRepository.existsById(id)) {
            salaryRepository.deleteById(id);
        }
        else {
            System.out.println("User not found");
        }
    }
}

