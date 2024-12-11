package jd_computers_and_applications.A.A_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {
}
