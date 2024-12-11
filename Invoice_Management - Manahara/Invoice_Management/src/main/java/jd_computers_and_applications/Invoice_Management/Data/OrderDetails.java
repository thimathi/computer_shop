package jd_computers_and_applications.Invoice_Management.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_ID")
    private int Order_ID;

    @Column(name = "Customer_ID")
    private int Customer_ID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Status")
    private String Status;

    @Column(name = "Amount")
    private double Amount;

    @Column(name = "Final_Date")
    private Date Final_Date;

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int order_ID) {
        Order_ID = order_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public Date getFinal_Date() {
        return Final_Date;
    }

    public void setFinal_Date(Date final_Date) {
        Final_Date = final_Date;
    }
}
