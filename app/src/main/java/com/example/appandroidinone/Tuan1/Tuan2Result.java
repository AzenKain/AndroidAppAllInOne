package com.example.appandroidinone.Tuan1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.appandroidinone.R;
public class Tuan2Result extends AppCompatActivity {
    TextView ans;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tuan2_result_layout);

        ans = findViewById(R.id.ans);

        Intent i1 = getIntent();

        float so1 = Float.parseFloat(i1.getExtras().getString("so1"));
        float so2 = Float.parseFloat(i1.getExtras().getString("so2"));

        ans.setText(String.valueOf(so1 +  so2));
    }
}
