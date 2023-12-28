package com.example.appandroidinone.Tuan1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appandroidinone.R;

import java.util.ArrayList;

public class Tuan3CustomListView extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tuan3_listview_layout);
        lvContact = findViewById(R.id.listView);
        ArrayList<Tuan3Contact> arrContact = new ArrayList<>();
        Tuan3Contact contact1 = new Tuan3Contact("Nguyen Van A", "099977888", "RED");
        Tuan3Contact contact2 = new Tuan3Contact("Tran Van B", "099966666", "RED");
        arrContact.add(contact2);
        arrContact.add(contact1);

        Tuan3CustomAdapter adapter = new Tuan3CustomAdapter(this, R.layout.tuan3_itemlistview_layout, arrContact);
        lvContact.setAdapter(adapter);
    }
}
