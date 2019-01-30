package com.example.rxapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

   /* @BindView(R.id.button_one)
    Button button1 = findViewById(R.id.button_one);

    @BindView(R.id.button_two)
    Button button2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Button button1 = findViewById(R.id.button_one);
        Button button2 = findViewById(R.id.button_two);
        Button button3 = findViewById(R.id.button_three);
        Button button4 = findViewById(R.id.button_four);
        Button button5 = findViewById(R.id.button_five);
        Button button6 = findViewById(R.id.button_six);

        View.OnClickListener action = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_one:
                        startActivity(new Intent(MainActivity.this, OneActivity.class));
                        break;

                    case R.id.button_two:
                        startActivity(new Intent(MainActivity.this, TwoActivity.class));
                        break;

                    case R.id.button_three:
                        startActivity(new Intent(MainActivity.this, ThreeActivity.class));
                        break;

                    case R.id.button_four:
                        startActivity(new Intent(MainActivity.this, FourActivity.class));
                        break;

                        case R.id.button_five:
                        startActivity(new Intent(MainActivity.this, FiveActivity.class));
                        break;

                        case R.id.button_six:
                        startActivity(new Intent(MainActivity.this, SixActivity.class));
                        break;
                }
            }
        };

        button1.setOnClickListener(action);
        button2.setOnClickListener(action);
        button3.setOnClickListener(action);
        button4.setOnClickListener(action);
        button5.setOnClickListener(action);
        button6.setOnClickListener(action);
    }
}


