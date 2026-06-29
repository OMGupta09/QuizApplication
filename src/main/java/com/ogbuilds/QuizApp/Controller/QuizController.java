package com.ogbuilds.QuizApp.Controller;

import com.ogbuilds.QuizApp.Model.QuestionWrapper;
import com.ogbuilds.QuizApp.Service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService)
    {
        this.quizService=quizService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,
                                           @RequestParam int numQ,
                                           @RequestParam String title)
    {
        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id)
    {
        return quizService.getQuizQuestions(id);
    }

}
