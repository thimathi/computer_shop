package jd_computers_and_applications.Invoice_Management.Controller;

import jd_computers_and_applications.Invoice_Management.Data.InvoiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jd_computers_and_applications.Invoice_Management.Data.InvoiceRepository;


import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceRepository invoiceRepository;

    @GetMapping(path = "/invoice")
    public List<InvoiceDetails> getInvoices() {
        return invoiceRepository.findAll();
    }

    @GetMapping(path = "/invoice/{invoiceId}")
    public InvoiceDetails getInvoice(@PathVariable int invoiceId) {
        return invoiceRepository.findById(invoiceId).get();
    }

    @PostMapping(path = "/invoice")
    public InvoiceDetails createInvoice(@RequestBody InvoiceDetails invoiceDetails) {
        return invoiceRepository.save(invoiceDetails);
    }

    @PutMapping(path = "/invoice/{invoiceId}")
    public InvoiceDetails updateInvoice(@PathVariable int invoiceId, @RequestBody InvoiceDetails invoiceDetails) {
        return invoiceRepository.findById(invoiceId).orElseThrow(() -> new RuntimeException("invoice Not Found"));
    }

    @DeleteMapping(path = "/invoice/{invoiceId}")
    public void deleteInvoice(@PathVariable int invoiceId) {
        invoiceRepository.deleteById(invoiceId);
    }
}
