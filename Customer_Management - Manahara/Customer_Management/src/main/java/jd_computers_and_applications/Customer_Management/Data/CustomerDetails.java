package jd_computers_and_applications.Customer_Management.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_ID")
    private int customerID;

    @Column(name = "Add_Date")
    private Date addDate;

    @Column(name = "Tp_Number")
    private int tpNumber;

    @Column(name = "Customer_Name")
    private String customerName;

    @Column(name = "UserType_ID")
    private final int userTypeID = 8;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public int getTpNumber() {
        return tpNumber;
    }

    public void setTpNumber(int tpNumber) {
        this.tpNumber = tpNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getUserTypeID() {
        return userTypeID;
    }
}
