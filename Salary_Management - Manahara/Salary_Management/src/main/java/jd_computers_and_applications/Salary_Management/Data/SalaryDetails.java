package jd_computers_and_applications.Salary_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "salary")
public class SalaryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Salary_ID")
    private int id;

    @Column(name = "Employee_ID")
    private int employee_id;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
