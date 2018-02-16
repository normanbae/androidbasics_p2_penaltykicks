package com.baeinc.normanbae.penaltykicks;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int shotsTeamA = 0;
    int scoreTeamB = 0;
    int shotsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     * Is there a way to make the toast "global"? It seems to crash my app when I try. Change context?
     */
    public void displayForTeamA(int scoreTeamA, int shotsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(scoreTeamA + getString(R.string.of) + shotsTeamA);
        Toast tooManyShots = Toast.makeText(this, getString(R.string.warning), Toast.LENGTH_SHORT);
        if (shotsTeamA > 5) {
            tooManyShots.show();
        }
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        shotsTeamA = shotsTeamA + 1;
        displayForTeamA(scoreTeamA, shotsTeamA);
    }

    /**
     * Increase the number of shots taken by Team A by 1.
     */
    public void addOneMissForTeamA(View v) {
        shotsTeamA = shotsTeamA + 1;
        displayForTeamA(scoreTeamA, shotsTeamA);
    }

    /**
     * Resets the score and shots taken for Team A to 0.
     */
    public void resetForTeamA(View v) {
        scoreTeamA = 0;
        shotsTeamA = 0;
        displayForTeamA(scoreTeamA, shotsTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB, int shotsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(scoreTeamB + getString(R.string.of) + shotsTeamB);
        Toast tooManyShots = Toast.makeText(this, getString(R.string.warning), Toast.LENGTH_SHORT);
        if (shotsTeamB > 5) {
            tooManyShots.show();
        }
    }

    /**
     * Increase the score for Team B by 1 point.
     * Increase the number of shots taken by Team B by 1.
     */
    public void addOneGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        shotsTeamB = shotsTeamB + 1;
        displayForTeamB(scoreTeamB, shotsTeamB);
    }

    /**
     * Increase the number of shots taken by Team B by 1.
     */
    public void addOneMissForTeamB(View v) {
        shotsTeamB = shotsTeamB + 1;
        displayForTeamB(scoreTeamB, shotsTeamB);
    }

    /**
     * Resets the score and shots taken for Team B to 0.
     */
    public void resetForTeamB(View v) {
        scoreTeamB = 0;
        shotsTeamB = 0;
        displayForTeamB(scoreTeamB, shotsTeamB);
    }

    /**
     * Resets the score and shots taken for both teams to 0.
     */
    public void reset(View v) {
        scoreTeamA = 0;
        shotsTeamA = 0;
        scoreTeamB = 0;
        shotsTeamB = 0;
        displayForTeamA(scoreTeamA, shotsTeamA);
        displayForTeamB(scoreTeamB, shotsTeamB);
    }

}
