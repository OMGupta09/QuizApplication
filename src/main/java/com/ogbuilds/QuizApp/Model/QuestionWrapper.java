package com.ogbuilds.QuizApp.Model;

import lombok.Data;

@Data
public class QuestionWrapper {

    private int id;

    String option1;

    String option2;

    String option3;

    String option4;

    String questiontitle;

    public QuestionWrapper(int id, String option1, String option2, String option3, String option4, String questiontitle) {
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questiontitle = questiontitle;
        this.id = id;
    }
}
