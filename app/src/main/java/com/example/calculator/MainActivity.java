package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive,
            btnSix, btnSeven, btnEight, btnNine, btnZero,
            btnDecimal,btnClear, btnEqual, btnDivide, btnMultiply,
            btnMinus, btnAdd,toSci,Convert;
    TextView tvExpression, tvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSci=findViewById(R.id.toSci);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree =findViewById(R.id.btnThree);
        btnFour =findViewById(R.id.btnFour);
        btnFive =findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven =findViewById(R.id.btnSeven);
        btnEight =findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

        btnDecimal =findViewById(R.id.btnDecimal);

        btnClear =findViewById(R.id.btnClear);
        btnDivide =findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus =findViewById(R.id.btnMinus);
        btnAdd =findViewById(R.id.btnAdd);
        btnEqual =findViewById(R.id.btnEqual);


        tvExpression = findViewById(R.id.tvExpression);
        tvResult = findViewById(R.id.tvResult);



        clearScreen();

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearScreen();
            }
        });



        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = tvExpression.getText().toString();

                Expression e = new Expression(expression);
                String result = String.valueOf(e.calculate());

                tvResult.setText(result);
            }
        });


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });
//        btnDoubleZero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                writeExpression("00");
//            }
//        });
//
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(".");
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });
    }


    void writeExpression(String value){
        String expression = tvExpression.getText().toString();
        expression = expression + value;

        tvExpression.setText(expression);
    }


    void clearScreen(){
        tvExpression.setText("");
        tvResult.setText("0");
    }


    public void convert(View view) {
        Intent i =new Intent(getApplicationContext(),convert.class);
        startActivity(i);
    }
}

