package jd_computers_and_applications.A.A_Management.Controller;

import jd_computers_and_applications.A.A_Management.Data.UserDetails;
import jd_computers_and_applications.A.A_Management.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/users")
    public List<UserDetails> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/users/{userId}")
    public UserDetails getUser(@PathVariable int userId) {
        return userRepository.findById(userId).get();
    }

    @PostMapping(path = "/users")
    public UserDetails createUser(@RequestBody UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    @PutMapping(path = "/users/{userId}")
    public UserDetails updateUser(@PathVariable int userId, @RequestBody UserDetails userDetails) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    @DeleteMapping(path = "/users/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userRepository.deleteById(userId);
    }
}
