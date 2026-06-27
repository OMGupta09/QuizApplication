package com.ogbuilds.QuizApp.Controller;

import com.ogbuilds.QuizApp.Model.Question;
import com.ogbuilds.QuizApp.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable("category") String category)
    {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/question")
    public Question addQuestion(@RequestBody Question question)
    {
        return questionService.createQuestion(question);
    }

    @PostMapping("/questions")
    public List<Question> addQuestions(@RequestBody List<Question> questions)
    {
        return questionService.createQuestions(questions);
    }

}
