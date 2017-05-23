package com.codeclan.example.wordcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 23/05/2017.
 */

public class AnswerActivity extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = (TextView)findViewById(R.id.answer_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer= extras.getString("answer");

        answerText.setText(answer);
    }
}
