package jd_computers_and_applications.Invoice_Management.Service;

import jd_computers_and_applications.Invoice_Management.Data.InvoiceDetails;
import jd_computers_and_applications.Invoice_Management.Data.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public List<InvoiceDetails> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public InvoiceDetails getInvoiceDetails(int id) {
        Optional<InvoiceDetails> invoiceDetails = invoiceRepository.findById(id);
        if (invoiceDetails.isPresent()) {
            return invoiceDetails.get();
        }
        else{
            return null;
        }
    }

    public void addInvoice(InvoiceDetails invoiceDetails) {
        invoiceRepository.save(invoiceDetails);
    }
    public void updateInvoice(int id, InvoiceDetails invoiceDetails) {
        if (invoiceRepository.findById(id).isPresent()) {
            invoiceRepository.save(invoiceDetails);
        }
        else{
            System.out.println("invoice not found");
        }
    }
    public void deleteInvoice(int id) {
        if(invoiceRepository.existsById(id)) {
            invoiceRepository.deleteById(id);
        }
        else {
            System.out.println("Invoice not found");
        }
    }
}
