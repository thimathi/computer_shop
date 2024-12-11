package jd_computers_and_applications.Customer_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "royality_customers")
public class RoyalityCustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Royality_Customer_ID")
    private int Royality_Customer_ID;

    @Column(name = "Customer_ID")
    private int customerID;

    public int getRoyality_Customer_ID() {
        return Royality_Customer_ID;
    }

    public void setRoyality_Customer_ID(int royality_Customer_ID) {
        Royality_Customer_ID = royality_Customer_ID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
