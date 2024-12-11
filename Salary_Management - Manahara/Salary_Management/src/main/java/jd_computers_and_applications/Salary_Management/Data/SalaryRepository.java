package jd_computers_and_applications.Salary_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<SalaryDetails,Integer> {
}
