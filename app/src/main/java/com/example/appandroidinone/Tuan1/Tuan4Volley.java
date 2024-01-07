package com.example.appandroidinone.Tuan1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import com.example.appandroidinone.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appandroidinone.R;

public class Tuan4Volley extends AppCompatActivity  {
    Button btnGetData;
    TextView tvKQ;
    Context context = this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tuan4_volley_layout);
        btnGetData = findViewById(R.id.tuan41btn);
        tvKQ = findViewById(R.id.tuan41textView);
        Tuan4VolleyFn fn = new Tuan4VolleyFn();
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn.getJsonArrayOfObject(context, tvKQ);
            }
        });
    }

}
