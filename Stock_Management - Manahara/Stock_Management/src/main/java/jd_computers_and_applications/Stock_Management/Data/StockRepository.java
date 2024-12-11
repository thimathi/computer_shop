package jd_computers_and_applications.Stock_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockDetails,Integer> {
}
