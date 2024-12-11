package jd_computers_and_applications.Stock_Management.Services;

import jd_computers_and_applications.Stock_Management.Data.SupplyDetails;
import jd_computers_and_applications.Stock_Management.Data.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {

    @Autowired
    SupplyRepository supplyRepository;

    public List<SupplyDetails> getSupplyDetails() {
        return supplyRepository.findAll();
    }

    public SupplyDetails getSupplyDetails(int id) {
        return supplyRepository.getOne(id);
    }

    public SupplyDetails addSupplyDetails(SupplyDetails supplyDetails) {
        return supplyRepository.save(supplyDetails);
    }

    public SupplyDetails updateSupplyDetails(SupplyDetails supplyDetails) {
        return supplyRepository.save(supplyDetails);
    }

    public void deleteSupplyDetails(int id) {
        if (supplyRepository.existsById(id)) {
            supplyRepository.deleteById(id);
        }
        else {
            System.out.println("Supply not found");
        }
    }
}
