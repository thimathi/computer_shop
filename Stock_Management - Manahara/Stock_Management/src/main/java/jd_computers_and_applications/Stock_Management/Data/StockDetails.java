package jd_computers_and_applications.Stock_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class StockDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Stock_ID")
    private int Stock_ID;

    @Column(name = "Stock_Name")
    private String Stock_Name;

    @Column(name = "Supplier_ID")
    private int Supplier_ID;

    public int getStock_ID() {
        return Stock_ID;
    }

    public void setStock_ID(int stock_ID) {
        Stock_ID = stock_ID;
    }

    public String getStock_Name() {
        return Stock_Name;
    }

    public void setStock_Name(String stock_Name) {
        Stock_Name = stock_Name;
    }

    public int getSupplier_ID() {
        return Supplier_ID;
    }

    public void setSupplier_ID(int supplier_ID) {
        Supplier_ID = supplier_ID;
    }
}
