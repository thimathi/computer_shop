package jd_computers_and_applications.Customer_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularCustomerRepository extends JpaRepository<RegularCustomerDetails, Integer> {
}
