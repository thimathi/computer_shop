package jd_computers_and_applications.User_Management.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {
}
