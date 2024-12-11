package jd_computers_and_applications.Payment_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDetails,Integer> {
}
