package jd_computers_and_applications.Supplier_Management.Controller;

import jd_computers_and_applications.Supplier_Management.Data.SupplierDetails;
import jd_computers_and_applications.Supplier_Management.Data.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping(path = "/supplier")
    public List<SupplierDetails> getSuppliers() {
        return supplierRepository.findAll();
    }

    @GetMapping(path = "/supplier/{supplierId}")
    public SupplierDetails getSupplier(@PathVariable int supplierId) {
        return supplierRepository.findById(supplierId).get();
    }

    @PostMapping(path = "/supplier")
    public SupplierDetails addSupplier(@RequestBody SupplierDetails supplierDetails) {
        return supplierRepository.save(supplierDetails);
    }

    @PutMapping(path = "/supplier/{supplierId}")
    public SupplierDetails updateSupplier(@PathVariable int supplierId, @RequestBody SupplierDetails supplierDetails) {
        return supplierRepository.findById(supplierId).orElseThrow(() -> new RuntimeException("Supplier Not Found"));
    }

    @DeleteMapping(path = "/supplier/{supplierId}")
    public void deleteSupplier(@PathVariable int supplierId) {
        supplierRepository.deleteById(supplierId);
    }
}

