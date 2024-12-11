package jd_computers_and_applications.Invoice_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<InvoiceDetails, Integer> {
}
