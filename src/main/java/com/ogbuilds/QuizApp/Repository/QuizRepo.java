package com.ogbuilds.QuizApp.Repository;

import com.ogbuilds.QuizApp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends JpaRepository<Question, Integer> {
    List<Question> findAllByCategory(String category);
}
