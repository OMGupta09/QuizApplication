package com.ogbuilds.QuizApp.Service;

import com.ogbuilds.QuizApp.Model.Question;
import com.ogbuilds.QuizApp.Repository.QuizRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private QuizRepo quizRepo;

    public QuestionService(QuizRepo quizRepo)
    {
        this.quizRepo=quizRepo;
    }

    public List<Question> getAllquestions()
    {
        return quizRepo.findAll();
    }

}
