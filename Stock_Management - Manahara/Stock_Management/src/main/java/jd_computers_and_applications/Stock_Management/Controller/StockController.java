package jd_computers_and_applications.Stock_Management.Controller;

import jd_computers_and_applications.Stock_Management.Data.StockDetails;
import jd_computers_and_applications.Stock_Management.Data.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @GetMapping(path = "/stocks")
    public List<StockDetails> getStocks() {
        return stockRepository.findAll();
    }

    @GetMapping(path = "/stocks/{userId}")
    public StockDetails getStock(@PathVariable int stockId) {
        return stockRepository.findById(stockId).get();
    }

    @PostMapping(path = "/stocks")
    public StockDetails createStock(@RequestBody StockDetails stockDetails) {
        return stockRepository.save(stockDetails);
    }

    @PutMapping(path = "/stocks/{stockId}")
    public StockDetails updateStock(@PathVariable int stockId, @RequestBody StockDetails stockDetails) {
        return stockRepository.findById(stockId).orElseThrow(() -> new RuntimeException("Stock Not Found"));
    }

    @DeleteMapping(path = "/stocks/{stockId}")
    public void deleteUser(@PathVariable int stockId) {
        stockRepository.deleteById(stockId);
    }
}