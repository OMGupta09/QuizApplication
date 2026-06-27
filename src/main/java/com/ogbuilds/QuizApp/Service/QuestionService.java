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

    public List<Question> getQuestionsByCategory(String category) {

        return quizRepo.findAllByCategory(category);

    }

    public Question createQuestion(Question question) {
        return quizRepo.save(question);
    }

    public List<Question> createQuestions(List<Question> questions)
    {
        return quizRepo.saveAll(questions);
    }
}
