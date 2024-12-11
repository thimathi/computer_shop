package jd_computers_and_applications.Customer_Management.Data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "regular_customers")
public class RegularCustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Regular_Customer_ID")
    private int regularCustomerID;

    @Column(name = "Customer_ID")
    private int customerID;

    public int getRegularCustomerID() {
        return regularCustomerID;
    }

    public void setRegularCustomerID(int regularCustomerID) {
        this.regularCustomerID = regularCustomerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

}
