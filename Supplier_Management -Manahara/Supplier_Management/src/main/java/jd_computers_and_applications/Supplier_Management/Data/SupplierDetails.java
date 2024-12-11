package jd_computers_and_applications.Supplier_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier")
public class SupplierDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Supplier_ID")
    private int supplierID;

    @Column(name = "Experience")
    private String experience;

    @Column(name = "NIC_Number")
    private String nicNumber;

    @Column(name = "UserType_ID")
    private int userTypeID;

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }
}
