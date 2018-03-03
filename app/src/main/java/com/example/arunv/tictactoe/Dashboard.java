package com.example.arunv.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);

        ListView listView= (ListView) findViewById(R.id.list);



        MyDatabaseHelper  mydb = new MyDatabaseHelper(this);
        ArrayList<String> array_list = mydb.getMyScore();
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, array_list);
        listView.setAdapter(arrayAdapter);



    }
}
