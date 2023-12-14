package com.example.basiccalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, subtract, multiply, divide, clear, equal, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    EditText working;
    TextView display;
    double val1, val2;
    boolean addB, subB, mulB, divB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        working = findViewById(R.id.working);
        working.setInputType(0);

        display = findViewById(R.id.display);

        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"0");
            }
        });


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"2");
            }
        });


        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"4");
            }
        });


        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"6");
            }
        });


        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"8");
            }
        });


        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working.setText(working.getText()+"9");
            }
        });





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (working.getText().toString().isEmpty()) {
                    return;
                }
                if (working == null){
                    working.setText("");
                }else {
                    val1 = Double.parseDouble(working.getText() + "");
                    addB = true;
                    display.setText(val1 + " +");
                    working.setText(null);
                }
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (working.getText().toString().isEmpty()) {
                    return;
                }
                if (working == null){
                    working.setText("");
                }else {
                    val1 = Double.parseDouble(working.getText() + "");
                    subB = true;
                    display.setText(val1 + " -");
                    working.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (working.getText().toString().isEmpty()) {
                    return;
                }
                if (working == null){
                    working.setText("");
                }else {
                    val1 = Double.parseDouble(working.getText() + "");
                    mulB = true;
                    display.setText(val1 + " *");
                    working.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (working.getText().toString().isEmpty()) {
                    return;
                }
                if (working == null){
                    working.setText("");
                }else {

                    val1 = Double.parseDouble(working.getText() + "");
                    divB = true;
                    display.setText(val1 + " /");
                    working.setText(null);
                }
            }
        });




        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalsCal();

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    working.setText("");
                    display.setText(null);
                }
            });
    }

    public void equalsCal(){
        if (working.getText().toString().isEmpty()) {
            return;
        }

        val2 = Double.parseDouble(working.getText() + "");

        if (addB == true) {
            display.setText(val1 + " + " + val2 + " = " + (val1 + val2));
            addB = false;
            working.setText(val1 + val2+"");
        }

        if (subB == true) {
            display.setText(val1 + " - " + val2 + " = " + (val1 - val2));
            subB = false;
            working.setText(val1 - val2+"");
        }

        if (mulB == true) {
            display.setText(val1 + " * " + val2 + " = " + (val1 * val2));
            mulB = false;
            working.setText(val1 * val2+"");
        }

        if (divB == true) {
            display.setText(val1 + " / " + val2 + " = " + (val1 / val2));
            divB = false;
            working.setText(val1 * val2+"");
        }
    }


}