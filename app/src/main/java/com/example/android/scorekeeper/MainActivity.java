package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Track The Runs For Team Marines
    int runMarines = 0;
    //Track The Outs For Team Marines
    int outMarines = 0;
    //Track The Runs For Team Travers
    int runTravers = 0;
    //Track The Outs For Team Travers
    int outTravers = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the Runs for Marines by point.
     */
    public void addPointForRunsOfTeamMarines(View v) {
        runMarines = runMarines + 1;
        displayRunsMarines(runMarines);
    }
    /**
     * Increase the Runs for outs of team Marines by point.
     */
    public void addPointForOutsOfTeamMarines(View v) {
        outMarines = outMarines + 1;
        displayOutsMarines(outMarines);
    }
    /**
     * Increase the Runs for Travers by point.
     */
    public void addPointForRunsOfTeamTravers(View v) {
        runTravers = runTravers + 1;
        displayRunsTravers(runTravers);
    }
    /**
     * Increase the Outs for Travers by point.
     */
    public void addPointForOutsOfTeamTravers(View v) {
        outTravers = outTravers + 1;
        displayOutsTravers(outTravers);
    }
    /**
     * Displays the given number of runs for Team Marines.
     */
    public void displayRunsMarines(int runs) {
        TextView scoreView = (TextView) findViewById(R.id.team_marines_runs);
        scoreView.setText(String.valueOf(runs));
    }
    /**
     * Displays the given number of outs for Team Marines.
     */
    public void displayOutsMarines(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_marines_outs);
        scoreView.setText(String.valueOf(outs));
    }
    /**
     * Displays the given number of runs for Team Travers.
     */
    public void displayRunsTravers(int runs) {
        TextView scoreView = (TextView) findViewById(R.id.team_travers_runs);
        scoreView.setText(String.valueOf(runs));
    }
    /**
     * Displays the given number of runs for Team Travers.
     */
    public void displayOutsTravers(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_travers_outs);
        scoreView.setText(String.valueOf(outs));
    }
    /**
     * Reset the score for both Team to be zero
     */
    public void Reset(View v) {
        displayRunsMarines(0);
        displayRunsTravers(0);
        displayOutsMarines(0);
        displayOutsTravers(0);
        runMarines = 0;
        outMarines = 0;
        runTravers = 0;
        outTravers = 0;
    }
}
