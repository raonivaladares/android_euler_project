package com.developers2.eulerproject;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.developers2.eulerproject.questions.Euler01;

public class ProblemDetailsActivity extends AppCompatActivity {

    public static String PARAM_PROBLEM = "Euler";
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_details);
        TextView textViewProblemEnunciation = (TextView) findViewById(R.id.text_view_problem_enunciation);
        TextView textViewResult = (TextView) findViewById(R.id.text_view_result);

         Intent intent = getIntent();
         int problemSelected = intent.getIntExtra(PARAM_PROBLEM, 0);
        executeEulerProblem(problemSelected, textViewProblemEnunciation, textViewResult);
    }

    private void executeEulerProblem(final int problemSelected, final TextView textViewProblemEnunciation, final TextView textViewResult) {
        callProgressDialog(this);
        final String problemEnunciation;
        final String solution;

        switch (problemSelected) {
            case 1:
                problemEnunciation = Euler01.getTitle();
                solution = Euler01.solution();
                break;
            default:
                problemEnunciation = "Error";
                solution =  "There was problem to solve this one";
        }
        textViewProblemEnunciation.setText(problemEnunciation);
        textViewResult.setText(solution);
        dismissProgressDialog();
    }

    private void callProgressDialog(final Context context) {
        dialog = ProgressDialog.show(context, "", "Loading", true);
    }

    private void dismissProgressDialog() {
        if(dialog != null) {
            dialog.dismiss();
        }
    }
}
