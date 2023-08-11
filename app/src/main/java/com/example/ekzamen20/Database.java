package com.example.ekzamen20;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Question> questions = new ArrayList<>();

    static {
        questions.add(
                new Question(
                        "Скільки березень має днів?",
                        Arrays.asList("28", "29", "30", "31"),
                        3
                ));
        questions.add(     new Question(
                        "Яка найбільша планета в Сонячній системі?",
                        Arrays.asList("Марс", "Венера", "Юпітер", "Земля"),
                        2
                ));
        questions.add(     new  Question(
                        "Яка головна мова в Україні?",
                        Arrays.asList("Англійська", "Російська", "Французька", "Українська"),
                        3
        ));
      questions.add(      new  Question(
                        "Яке найвище горе в світі?",
                        Arrays.asList("Ельбрус", "Кіліманджаро", "Еверест", "Монблан"),
                        2
                ));
       questions.add(      new  Question(
                        "Що вимірює вологість повітря?",
                        Arrays.asList("Термометр", "Барометр", "Психрометр", "Термопара"),
                        2
                        ));
       questions.add(     new   Question(
                        "Який хімічний елемент позначається символом Fe?",
                        Arrays.asList("Фосфор", "Залізо", "Фтор", "Ферум"),
                        1
                                ));
                                        questions.add(     new Question(
                        "Яка планета названа на честь римського бога війни?",
                        Arrays.asList("Марс", "Юпітер", "Нептун", "Уран"),
                        0
                                        ));
                                                questions.add(     new Question(
                        "Яка найбільша планета в Сонячній системі?",
                        Arrays.asList("Марс", "Венера", "Юпітер", "Земля"),
                        2
                                                ));
                                                        questions.add(     new Question(
                        "Яка найбільша планета в Сонячній системі?",
                        Arrays.asList("Марс", "Венера", "Юпітер", "Земля"),
                        2
                                                        ));
                                                                questions.add(      new Question(
                        "Яка найбільша планета в Сонячній системі?",
                        Arrays.asList("Марс", "Венера", "Юпітер", "Земля"),
                        2
                                                                ));


    }
}
