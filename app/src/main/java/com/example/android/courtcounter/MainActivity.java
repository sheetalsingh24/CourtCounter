package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int score_A=0;
    int score_B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Displays the given score for Team A.
     */

    public void add_3(View view)
    {
        score_A=score_A+3;
        displayForTeamA(score_A);
    }
    public void add_2(View view)
    {
        score_A=score_A+2;
        displayForTeamA(score_A);
    }
    public void add_11(View view)
    {
        score_A=score_A+1;
        displayForTeamA(score_A);
    }
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the given score for Team B.
     */

    public void add_3b(View view)
    {
        score_B=score_B+3;
        displayForTeamB(score_B);
    }
    public void add_2b(View view)
    {
        score_B=score_B+2;
        displayForTeamB(score_B);
    }
    public void add_1b(View view)
    {
        score_B=score_B+1;
        displayForTeamB(score_B);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset_score(View view)
    {
        score_B=0;
        score_A=0;
        displayForTeamA(0);
        displayForTeamB(0);

    }
}
