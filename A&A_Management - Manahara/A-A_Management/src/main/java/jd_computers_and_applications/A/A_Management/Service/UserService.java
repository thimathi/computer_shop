package jd_computers_and_applications.A.A_Management.Service;

import jd_computers_and_applications.A.A_Management.Data.UserDetails;
import jd_computers_and_applications.A.A_Management.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDetails getUserDetails(int id) {
        Optional<UserDetails> userDetails = userRepository.findById(id);
        if (userDetails.isPresent()) {
            return userDetails.get();
        }
        else{
            return null;
        }
    }

    public void addUser(UserDetails userDetails) {
        userRepository.save(userDetails);
    }
    public void updateUser(int id, UserDetails userDetails) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.save(userDetails);
        }
        else{
            System.out.println("User not found");
        }
    }
    public void deleteUser(int id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
        else {
            System.out.println("User not found");
        }
    }
}
