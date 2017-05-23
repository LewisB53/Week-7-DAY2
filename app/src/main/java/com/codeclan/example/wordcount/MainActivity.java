package com.codeclan.example.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText wordsEditText;
    Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().toString(), "about to set content view");
        setContentView(R.layout.activity_main);
        Log.d(getClass().toString(), "content view set");

        wordsEditText = (EditText)findViewById(R.id.words_text);
        countButton = (Button)findViewById(R.id.countWords_button);

    }
    public void onCountButtonClicked(View Button){
        Log.d(getClass().toString(),"Count button was clicked");
        String words = wordsEditText.getText().toString();
        Log.d(getClass().toString(),"the question was: " + words);

        WordCount wordCount = new WordCount();
        int answer = wordCount.NumberofWords(words);

        Intent intent = new Intent (this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }
}
