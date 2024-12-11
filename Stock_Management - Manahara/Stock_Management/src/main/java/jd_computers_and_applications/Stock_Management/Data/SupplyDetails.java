package jd_computers_and_applications.Stock_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "supply")
public class SupplyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Supply_ID")
    private int supplyID;

    @Column(name = "Supplier_ID")
    private int supplierID;

    public int getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int supplyID) {
        this.supplyID = supplyID;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
}
