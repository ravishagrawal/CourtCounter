package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA=0;
    int scoreTeamB=0;
    int wicketsTeamA=0;
    int wicketsTeamB=0;

    public void addSixForTeamA (View view) {
        scoreTeamA= scoreTeamA +6;
        displayForTeamA(scoreTeamA);
    }

    public void addFourForTeamA (View view) {
        scoreTeamA= scoreTeamA +4;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA (View view) {
        scoreTeamA= scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA (View view) {
        scoreTeamA= scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA (View view) {
        scoreTeamA= scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void addWicketsTeamA (View view) {
        if (wicketsTeamA < 10) {

            wicketsTeamA = wicketsTeamA + 1;
            displayWicketsForTeamA(wicketsTeamA);
        }

        else {
            Toast.makeText(this, "Maximum No. Of wickets Reached. Innings Over!",
                    Toast.LENGTH_SHORT).show();
            wicketsTeamA = 10;
            displayWicketsForTeamA(wicketsTeamA);
        }
    }

    public void addSixForTeamB (View view) {
        scoreTeamB= scoreTeamB +6;
        displayForTeamB(scoreTeamB);
    }

    public void addFourForTeamB (View view) {
        scoreTeamB= scoreTeamB +4;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB (View view) {
        scoreTeamB= scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB (View view) {
        scoreTeamB= scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB (View view) {
        scoreTeamB= scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    public void addWicketsTeamB (View view) {
        if (wicketsTeamB < 10) {

            wicketsTeamB = wicketsTeamB + 1;
            displayWicketsForTeamB(wicketsTeamB);
        }

        else {
            Toast.makeText(this, "Maximum No. Of wickets Reached. Innings Over!",
                    Toast.LENGTH_SHORT).show();
            wicketsTeamB = 10;
            displayWicketsForTeamB(wicketsTeamB);
        }
    }

    public void scoreReset (View view) {
        scoreTeamA= 0;
        scoreTeamB= 0;
        wicketsTeamA = 0 ;
        wicketsTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayWicketsForTeamA (wicketsTeamA);
        displayWicketsForTeamB (wicketsTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the wickets for Team A.
     */
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickets_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the wickets for Team A.
     */
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickets_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
