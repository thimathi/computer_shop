package jd_computers_and_applications.Payment_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethodDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Method_ID")
    private int Method_ID;

    @Column(name = "Payment_Method_Name")
    private String Payment_Method_Name;

    @Column(name = "Status")
    private String Status;

    @Column(name = "Amount")
    private double Amount;

    public int getMethod_ID() {
        return Method_ID;
    }

    public void setMethod_ID(int method_ID) {
        Method_ID = method_ID;
    }

    public String getPayment_Method_Name() {
        return Payment_Method_Name;
    }

    public void setPayment_Method_Name(String payment_Method_Name) {
        Payment_Method_Name = payment_Method_Name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
