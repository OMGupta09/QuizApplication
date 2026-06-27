package com.ogbuilds.QuizApp.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "questiondb")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String category;

    String difficultyLevel;

    String option1;

    String option2;

    String option3;

    String option4;

    String questiontitle;

    String rightanswer;

}
