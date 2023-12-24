package com.example.appandroidinone.Tuan1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appandroidinone.R;

public class Tuan2ListView extends AppCompatActivity {
    ListView listV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuan2_listview_layout);

        listV = findViewById(R.id.list);

        String[] arr = new String[] {"mon1", "mon2", "mon3", "mon4", "mon5"};

        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        listV.setAdapter(adapter);
    }
}
