package jd_computers_and_applications.Stock_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<SupplyDetails,Integer> {
}
