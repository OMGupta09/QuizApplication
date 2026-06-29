package com.ogbuilds.QuizApp.Service;

import com.ogbuilds.QuizApp.Controller.QuizController;
import com.ogbuilds.QuizApp.Model.Question;
import com.ogbuilds.QuizApp.Model.QuestionWrapper;
import com.ogbuilds.QuizApp.Model.Quiz;
import com.ogbuilds.QuizApp.Repository.QuestionRepo;
import com.ogbuilds.QuizApp.Repository.QuizRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    private QuizRepo quizRepo;

    private QuestionRepo questionRepo;

    public QuizService(QuizRepo quizRepo, QuestionRepo questionRepo)
    {
        this.quizRepo=quizRepo;
        this.questionRepo=questionRepo;
    }

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questions= questionRepo.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

        quizRepo.save(quiz);

        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {

        Quiz quiz = quizRepo.findById(id).get();

        List<Question> questionsFromDB=quiz.getQuestions();

        List<QuestionWrapper> questionsForUser=new ArrayList<>();

        for(Question q : questionsFromDB)
        {
            QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4(),q.getQuestiontitle());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }
}
