package jd_computers_and_applications.Supplier_Management.Service;

import jd_computers_and_applications.Supplier_Management.Data.SupplierDetails;
import jd_computers_and_applications.Supplier_Management.Data.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<SupplierDetails> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public SupplierDetails getSupplierDetailsBySupplierId(int supplierId) {
        Optional<SupplierDetails> supplierDetails = supplierRepository.findById(supplierId);
        if (supplierDetails.isPresent()) {
            return supplierDetails.get();
        }
        else {
            return null;
        }
    }

    public SupplierDetails addSupplier(SupplierDetails supplierDetails) {
        return supplierRepository.save(supplierDetails);
    }

    public SupplierDetails updateSupplier(int supplierId, SupplierDetails supplierDetails) {
        if (supplierRepository.existsById(supplierId)) {
            return supplierRepository.save(supplierDetails);
        }
        return null;
    }

    public void deleteSupplier(int supplierId) {
        if (supplierRepository.existsById(supplierId)) {
            supplierRepository.deleteById(supplierId);
        }
        else {
            System.out.println("Supplier not found");
        }
    }
}
