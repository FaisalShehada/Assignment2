package com.example.faisal.assignmnet2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button MemoryClear, MemoryRecall, MemoryAdd, Clear, Back, Negation, Div, Equal, Plus, Sub, Mul;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    TextView Screen;
    double MemoryNumber, num1, num2;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialze();


        zero.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(zero.getText().toString());
                else
                    Screen.append(zero.getText().toString());

            }
        });


        one.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(one.getText().toString());
                else
                    Screen.append(one.getText().toString());

            }
        });

        two.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(two.getText().toString());
                else
                    Screen.append(two.getText().toString());
            }
        });

        three.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(three.getText().toString());
                else
                    Screen.append(three.getText().toString());

            }
        });

        four.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(four.getText().toString());
                else
                    Screen.append(four.getText().toString());
            }
        });

        five.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(five.getText().toString());
                else
                    Screen.append(five.getText().toString());

            }
        });

        six.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(six.getText().toString());
                else
                    Screen.append(six.getText().toString());

            }
        });

        seven.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(seven.getText().toString());
                else
                    Screen.append(seven.getText().toString());

            }
        });

        eight.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(eight.getText().toString());
                else
                    Screen.append(eight.getText().toString());

            }
        });

        nine.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Screen.getText().toString().equals("0"))
                    Screen.setText(nine.getText().toString());
                else
                    Screen.append(nine.getText().toString());

            }
        });

        Clear.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Screen.setText("");

            }
        });
        MemoryClear.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                MemoryNumber = 0;
                Toast.makeText(getApplicationContext(), "Memory Cleared", Toast.LENGTH_SHORT).show();


            }
        });
        MemoryRecall.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Screen.setText(MemoryNumber + "");

            }
        });
        MemoryAdd.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                MemoryNumber += Double.parseDouble(Screen.getText().toString());
                Screen.setText("");
            }
        });
        Back.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                String oldText = Screen.getText().toString();
                String newtext = "";

                for (int i = 0; i < oldText.length() - 1; i++) {
                    newtext += oldText.charAt(i) + "";

                }
                Screen.setText(newtext.toString());


            }
        });

        Plus.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                operation = "+";

                num1 = Double.parseDouble(Screen.getText().toString());
                Screen.setText("");

            }
        });
        Div.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                operation = "/";

                num1 = Double.parseDouble(Screen.getText().toString());
                Screen.setText("");

            }
        });
        Mul.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                operation = "*";

                num1 = Double.parseDouble(Screen.getText().toString());
                Screen.setText("");

            }
        });
        Sub.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                operation = "-";

                num1 = Double.parseDouble(Screen.getText().toString());
                Screen.setText("");

            }
        });
        Negation.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!Screen.getText().toString().equals("0.0") && !Screen.getText().toString().equals("0") && !Screen.getText().toString().equals("")) {
                    double number = Double.parseDouble(Screen.getText().toString());
                    number = number * -1;
                    Screen.setText(number + "");
                }

            }
        });
        Equal.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Operations();
            }
        });


    }

    public void Initialze() {
        Screen = (TextView) findViewById(R.id.Screen);
        MemoryClear = (Button) findViewById(R.id.MemoryClear);
        MemoryAdd = (Button) findViewById(R.id.MemoryAdd);
        MemoryRecall = (Button) findViewById(R.id.MemoryRecall);
        Clear = (Button) findViewById(R.id.Clear);
        Back = (Button) findViewById(R.id.Back);
        Negation = (Button) findViewById(R.id.Negation);
        Div = (Button) findViewById(R.id.Div);
        Equal = (Button) findViewById(R.id.Equal);
        Plus = (Button) findViewById(R.id.Plus);
        Sub = (Button) findViewById(R.id.Sub);
        Mul = (Button) findViewById(R.id.Mul);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
    }

    public void Operations() {
        num2 = Double.parseDouble(Screen.getText().toString());
        double result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                Screen.setText(result + "");
                break;
            case "-":
                result = num1 - num2;
                Screen.setText(result + "");
                break;
            case "*":
                result = num1 * num2;
                Screen.setText(result + "");
                break;
            case "/":
                if (num2 == 0) {
                    Toast.makeText(getApplicationContext(), "You Cant Div On Zero", Toast.LENGTH_SHORT).show();
                    Screen.setText("");
                } else {
                    result = num1 / num2;
                    Screen.setText(new DecimalFormat("##.##").format(result));
                    // Screen.setText(result + "");
                }
                break;
        }

    }

}
