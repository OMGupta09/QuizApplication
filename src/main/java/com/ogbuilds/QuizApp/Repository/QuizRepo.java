package com.ogbuilds.QuizApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ogbuilds.QuizApp.Model.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
