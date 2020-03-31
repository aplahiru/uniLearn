package lk.UniLearn.studentlearning.services;

import lk.UniLearn.studentlearning.Models.User;
import lk.UniLearn.studentlearning.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public void addUser(User user) {
        userRepo.save(user);
    }

    public User getOneUser(String userId) {
        return userRepo.findByUserId(userId);
    }
}
