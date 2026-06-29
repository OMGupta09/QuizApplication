package com.ogbuilds.QuizApp.Service;

import com.ogbuilds.QuizApp.Model.Question;
import com.ogbuilds.QuizApp.Repository.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo)
    {
        this.questionRepo = questionRepo;
    }

    public List<Question> getAllquestions()
    {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {

        return questionRepo.findAllByCategory(category);

    }

    public Question createQuestion(Question question) {
        return questionRepo.save(question);
    }

    public List<Question> createQuestions(List<Question> questions)
    {
        return questionRepo.saveAll(questions);
    }
}
