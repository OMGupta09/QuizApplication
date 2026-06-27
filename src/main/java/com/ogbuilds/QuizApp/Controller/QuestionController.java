package com.ogbuilds.QuizApp.Controller;

import com.ogbuilds.QuizApp.Model.Question;
import com.ogbuilds.QuizApp.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService)
    {
        this.questionService=questionService;
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllquestions();
    }

    public

}
