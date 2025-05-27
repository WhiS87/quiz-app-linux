package it.manuelhartmann.quiz;

import it.manuelhartmann.quiz.model.QuestionType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuizAppApplication.class, args);

        // das ist eine reine Test Logik darunter!


        QuestionType qT = QuestionType.SINGLE_CHOICE;
        System.out.println(qT.getDisplayName());

//        qT.setDisplayName("Anderer Displayname");
        System.out.println(qT.getDisplayName());


    }

}
