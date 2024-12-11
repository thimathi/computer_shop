package jd_computers_and_applications.Salary_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "payroll")
public class PayRollDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payroll_ID")
    private int id;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Payment_Status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
