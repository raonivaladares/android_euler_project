package com.developers2.eulerproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.developers2.eulerproject.questions.Euler01;

public class ProblemDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_details);
        TextView textViewProblemEnunciation = (TextView) findViewById(R.id.text_view_problem_enunciation);
        TextView textViewResult = (TextView) findViewById(R.id.text_view_result);

        textViewProblemEnunciation.setText(Euler01.getTitle());
        textViewResult.setText(Euler01.solution());
    }
}
