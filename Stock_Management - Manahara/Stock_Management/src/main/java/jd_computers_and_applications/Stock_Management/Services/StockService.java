package jd_computers_and_applications.Stock_Management.Services;

import jd_computers_and_applications.Stock_Management.Data.StockDetails;
import jd_computers_and_applications.Stock_Management.Data.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<StockDetails> getStockDetails() {
        return stockRepository.findAll();
    }

    public StockDetails getStockDetails(int id) {
        Optional<StockDetails> stockDetails = stockRepository.findById(id);
        if (stockDetails.isPresent()) {
            return stockDetails.get();
        }
        return null;
    }

    public void addStockDetails(StockDetails stockDetails) {
        stockRepository.save(stockDetails);
    }
    public void updateStockDetails(StockDetails stockDetails) {
        stockRepository.save(stockDetails);
    }
    public void deleteStockDetails(int id) {
        if (stockRepository.existsById(id)) {
            stockRepository.deleteById(id);
        }
        else {
            System.out.println("Stock does not exist");
        }
    }
}
