package com.actiknow.machinetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

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
        initListener ();
    }

    private void initView () {
        etValueOfN = (EditText) findViewById (R.id.etValueOfN);
        btGetSeries = (Button) findViewById (R.id.btGetSeries);
        btFromAPI = (Button) findViewById (R.id.btFromAPI);
        tvSeries = (TextView) findViewById (R.id.tvSeries);
        tvEvenSum = (TextView) findViewById (R.id.tvEvenSum);
        tvOddSum = (TextView) findViewById (R.id.tvOddSum);
    }

    private void initListener () {
        btGetSeries.setOnClickListener (this);
        btFromAPI.setOnClickListener (this);
    }

    @Override
    public void onClick (View view) {
        int valueOfN;
        switch (view.getId ()) {
            case R.id.btGetSeries:
                valueOfN = parseInt (etValueOfN.getText ().toString ());
                tvSeries.setText (printSeries (valueOfN));
                tvOddSum.setText ("" + getOddSum (valueOfN));
                tvEvenSum.setText ("" + getEvenSum (valueOfN));
                break;
            case R.id.btFromAPI:
                valueOfN = getValueOfNFromAPI ();
                tvSeries.setText (printSeries (valueOfN));
                tvOddSum.setText ("" + getOddSum (valueOfN));
                tvEvenSum.setText ("" + getEvenSum (valueOfN));
                break;
        }
    }

    public int getValueOfNFromAPI () {
        String URL = "https://blood-connect-cammy92.c9users.io/random.php"; // generates a random number between 10-16

        return 12;
    }

    public int getOddSum (int n) {
        int oddSum = 0;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            if (fib[i] % 2 != 0) {
                oddSum = oddSum + fib[i];
            }
        }
        return oddSum;
    }

    public int getEvenSum (int n) {
        int evenSum = 0;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            if (fib[i] % 2 == 0) {
                evenSum = evenSum + fib[i];
            }
        }
        return evenSum;
    }

    public String printSeries (int n) {
        StringBuilder series = new StringBuilder ();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            series.append (fib[i] + ",");
        }

/*
        int n1 = 0;
        int n2 = 1;
        int n3;
        series.append (n1 + ",");
        series.append (n2 + ",");
        for (int i = 2; i < n; ++ i) {
            n3 = n1 + n2;
            series.append (n3 + ",");
            n1 = n2;
            n2 = n3;
        }
*/
        return series.toString ();
    }
}