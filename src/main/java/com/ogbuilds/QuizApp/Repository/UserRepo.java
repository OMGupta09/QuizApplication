package com.ogbuilds.QuizApp.Repository;

import com.ogbuilds.QuizApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
