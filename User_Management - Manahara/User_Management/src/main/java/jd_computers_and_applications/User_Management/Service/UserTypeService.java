package jd_computers_and_applications.User_Management.Service;

import jd_computers_and_applications.User_Management.Data.UserTypeDetails;
import jd_computers_and_applications.User_Management.Data.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {

    @Autowired
    UserTypeRepository userTypeRepository;
    public List<UserTypeDetails> getAllUserTypes() {
        return userTypeRepository.findAll();
    }

    public UserTypeDetails getUserTypeById(int id) {
        return userTypeRepository.findById(id).get();
    }

    public UserTypeDetails addUserType(UserTypeDetails userTypeDetails) {
        return userTypeRepository.save(userTypeDetails);
    }
    public UserTypeDetails updateUserType(UserTypeDetails userTypeDetails) {
        return userTypeRepository.save(userTypeDetails);
    }
    public void deleteUserType(int id) {
        userTypeRepository.deleteById(id);
    }
}
