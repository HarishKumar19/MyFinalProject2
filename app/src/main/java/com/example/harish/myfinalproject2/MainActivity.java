package com.example.harish.myfinalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }
    /**
     * Method to calculate final score of the quiz competition.
     */

    public void submit(View view) {

        TextView textView = findViewById(R.id.scoreDisplay);
        int scoreAnswerOne, scoreAnswerTwo, scoreAnswerThree, scoreAnswerFour, scoreAnswerFive,
                finalScore;
        CharSequence result;
        RadioButton questionOneAnswerOne = findViewById(R.id.radiobutton1);
        if (questionOneAnswerOne.isChecked()) {
            scoreAnswerOne = 1;
        } else {
            scoreAnswerOne = 0;
        }
        RadioButton questionTwoAnswer = findViewById(R.id.radiobutton7);
        if (questionTwoAnswer.isChecked()) {
            scoreAnswerTwo = 2;
        }
        else {
            scoreAnswerTwo=0;
        }
        RadioButton questionThreeAnswer = findViewById(R.id.radiobutton9);

        if (questionThreeAnswer.isChecked()) {
            scoreAnswerThree = 1;
        } else {
            scoreAnswerThree = 0;
        }
        RadioButton questionFourAnswer = findViewById(R.id.radiobutton15);

        if (questionFourAnswer.isChecked()) {
            scoreAnswerFour = 1;
        } else {
            scoreAnswerFour = 0;
        }
        CheckBox questionFiveAnswerOne = findViewById(R.id.checkbox1);
        CheckBox questionFiveAnswerTwo = findViewById(R.id.checkbox2);
        CheckBox questionFiveAnswerThree = findViewById(R.id.checkbox3);
        CheckBox questionFiveAnswerFour = findViewById(R.id.checkbox4);
        if (questionFiveAnswerOne.isChecked() && questionFiveAnswerTwo.isChecked() &&
                !questionFiveAnswerThree.isChecked() && questionFiveAnswerFour.isChecked()) {
            scoreAnswerFive = 1;
        } else {
            scoreAnswerFive = 0;
        }
        finalScore = scoreAnswerOne + scoreAnswerTwo + scoreAnswerThree + scoreAnswerFour +
                scoreAnswerFive ;

        if (finalScore == 5) {
            result = "Well done! You are genius";
        } else {
            result = "Hard Luck! Try Again! :)";
        }
        textView.setText(finalScore);

        Toast toast = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    }


