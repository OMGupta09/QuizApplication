package com.ogbuilds.QuizApp.Service;

import com.ogbuilds.QuizApp.Model.User;
import com.ogbuilds.QuizApp.Repository.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepo userRepo,PasswordEncoder passwordEncoder)
    {
        this.userRepo=userRepo;
        this.passwordEncoder=passwordEncoder;
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepo.save(user);
    }


    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        return userRepo.findById(id).orElse(new User());
    }
}
