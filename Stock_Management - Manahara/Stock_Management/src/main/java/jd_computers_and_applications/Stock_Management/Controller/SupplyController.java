package jd_computers_and_applications.Stock_Management.Controller;

import jd_computers_and_applications.Stock_Management.Data.SupplyDetails;
import jd_computers_and_applications.Stock_Management.Data.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplyController {

    @Autowired
    SupplyRepository supplyRepository;

    @GetMapping(path = "/supply")
    public List<SupplyDetails> getSupplyDetails() {
        return supplyRepository.findAll();
    }

    @GetMapping(path = "/supply/{supplyId}")
    public SupplyDetails getSupply(@PathVariable int supplyId) {
        return supplyRepository.findById(supplyId).get();
    }

    @PostMapping(path = "/supply")
    public SupplyDetails createSupply(@RequestBody SupplyDetails supplyDetails) {
        return supplyRepository.save(supplyDetails);
    }

    @PutMapping(path = "/supply/{supplyId}")
    public SupplyDetails updateSupply(@PathVariable int supplyId, @RequestBody SupplyDetails supplyDetails) {
        return supplyRepository.findById(supplyId).orElseThrow(() -> new RuntimeException("Supply Not Found"));
    }

    @DeleteMapping(path = "/supply/{supplyId}")
    public void deleteSupply(@PathVariable int supplyId) {
        supplyRepository.deleteById(supplyId);
    }
}