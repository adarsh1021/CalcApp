package com.nit.calcapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcActivity extends Activity implements View.OnClickListener {

    // Declare view components inside the class
    EditText etFirstNumber, etSecondNumber;
    TextView tvResult;
    Button btnAdd,btnSub,btnMul,btnDiv,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Create one empty window
        super.onCreate(savedInstanceState);

        // Load XML File into this empty window
        setContentView(R.layout.activity_calc);

        // Initialize view components
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        btnClear = (Button) findViewById(R.id.btnClear);
        tvResult = (TextView) findViewById(R.id.tvResult);

        // Apply onClick listeners for the buttons
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // Convert character sequence into string
        String fnum = etFirstNumber.getText().toString();
        String snum = etSecondNumber.getText().toString();

        // Convert sting into integer by using wrapper classes
        int n1 = (int) Integer.parseInt(fnum);
        int n2 = (int) Integer.parseInt(snum);
        int result=0;

        switch (v.getId())
        {
            case R.id.btnAdd:
                result=n1+n2;
                tvResult.setText(""+result);
                break;
            case R.id.btnSub:
                result=n1-n2;
                tvResult.setText(""+result);
                break;
            case R.id.btnMul:
                result=n1*n2;
                tvResult.setText(""+result);
                break;
            case R.id.btnDiv:
                result=n1/n2;
                tvResult.setText(""+result);
                break;

            case R.id.btnClear:
                etFirstNumber.getText().clear();
                etSecondNumber.getText().clear();
                tvResult.setText("");
                break;
        }
    }
}
