package com.example.ekzamen20;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private TextView questionTextView;
    private Button[] optionButtons = new Button[4];
    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTextView = findViewById(R.id.questionTextView);
        optionButtons[0] = findViewById(R.id.optionButton1);
        optionButtons[1] = findViewById(R.id.optionButton2);
        optionButtons[2] = findViewById(R.id.optionButton3);
        optionButtons[3] = findViewById(R.id.optionButton4);

        loadQuestion(currentQuestionIndex);

        for (int i = 0; i < optionButtons.length; i++) {
            final int optionIndex = i;
            optionButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onOptionSelected(optionIndex);
                }
            });
        }
    }

    private void loadQuestion(int index) {
        Question question = Database.questions.get(index);
        questionTextView.setText(question.getQuestionText());
        List<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            optionButtons[i].setText(options.get(i));
        }
    }

    private void onOptionSelected(int selectedIndex) {
        Question question = Database.questions.get(currentQuestionIndex);
        if (selectedIndex == question.getCorrectOptionIndex()) {
            showResultDialog("Вірно!");
            currentQuestionIndex++;
            if (currentQuestionIndex < Database.questions.size()) {
                loadQuestion(currentQuestionIndex);
            } else {
                showResultDialog("Вітаю ви відповіли на всі питання!");
            }
        } else {
            showResultDialog("Ви програли!");
            finish();
        }
    }

    private void showResultDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton("Окей", null)
                .create();
        alertDialog.show();
    }
}
