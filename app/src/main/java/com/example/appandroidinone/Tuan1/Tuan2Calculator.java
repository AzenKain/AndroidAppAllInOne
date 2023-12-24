package com.example.appandroidinone.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import com.example.appandroidinone.R;
public class Tuan2Calculator extends AppCompatActivity{
    EditText number1, number2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuan2_calculator_layout);

        number1 = findViewById(R.id.numberOne);
        number2 = findViewById(R.id.numberTwo);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tuan2Calculator.this, Tuan2Result.class);

                i.putExtra("so1", number1.getText().toString());
                i.putExtra("so2", number2.getText().toString());

                startActivity(i);
            }
        });

        number1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(number1);
                }
            }
        });

        number2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(number2);
                }
            }

        });


    }
    private void resetData(EditText data) {
        data.setText("");
    }
}
