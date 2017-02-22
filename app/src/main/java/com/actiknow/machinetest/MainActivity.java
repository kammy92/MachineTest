package com.actiknow.machinetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etValueOfN;
    Button btGetSeries;
    Button btFromAPI;
    TextView tvSeries;
    TextView tvEvenSum;
    TextView tvOddSum;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        initView ();
    }

    private void initView () {
        etValueOfN = (EditText) findViewById (R.id.etValueOfN);
        btGetSeries = (Button) findViewById (R.id.btGetSeries);
        btFromAPI = (Button) findViewById (R.id.btFromAPI);
        tvSeries = (TextView) findViewById (R.id.tvSeries);
        tvEvenSum = (TextView) findViewById (R.id.tvEvenSum);
        tvOddSum = (TextView) findViewById (R.id.tvOddSum);
    }


    @Override
    public void onClick (View view) {
    }

    public int getValueOfNFromAPI () {
        String URL = "https://blood-connect-cammy92.c9users.io/random.php"; // generates a random number between 10-16
        // Get a number from API
        return 12;
    }

    public int getOddSum (int n) {
        int oddSum = 0;
        // Find sum of odd numbers in the series
        return oddSum;
    }

    public int getEvenSum (int n) {
        int evenSum = 0;
        // Find sum of even numbers in the series
        return evenSum;
    }

    public String printSeries (int n) {
        String series = "0";
        // Return the series as a string
        return series;
    }

}
