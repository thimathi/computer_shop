package jd_computers_and_applications.Invoice_Management.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "invoice")
public class InvoiceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Invoice_ID")
    private int Invoice_ID;

    @Column(name = "Issued_Date")
    private Date Issued_Date;

    @Column(name = "Status")
    private String Status;

    @Column(name = "Warranty")
    private String Warranty;

    @Column(name = "Rules_and_Regulations")
    private String Rules_and_Regulations;

    public int getInvoice_ID() {
        return Invoice_ID;
    }

    public void setInvoice_ID(int invoice_ID) {
        Invoice_ID = invoice_ID;
    }

    public Date getIssued_Date() {
        return Issued_Date;
    }

    public void setIssued_Date(Date issued_Date) {
        Issued_Date = issued_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getWarranty() {
        return Warranty;
    }

    public void setWarranty(String warranty) {
        Warranty = warranty;
    }

    public String getRules_and_Regulations() {
        return Rules_and_Regulations;
    }

    public void setRules_and_Regulations(String rules_and_Regulations) {
        Rules_and_Regulations = rules_and_Regulations;
    }
}
