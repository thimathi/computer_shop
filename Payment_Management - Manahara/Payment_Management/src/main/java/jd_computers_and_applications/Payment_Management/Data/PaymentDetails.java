package jd_computers_and_applications.Payment_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payment_ID")
    private int Payment_ID;

    @Column(name = "Method_ID")
    private int Method_ID;

    @Column(name = "amount")
    private double Amount;

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int payment_ID) {
        Payment_ID = payment_ID;
    }

    public int getMethod_ID() {
        return Method_ID;
    }

    public void setMethod_ID(int method_ID) {
        Method_ID = method_ID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
