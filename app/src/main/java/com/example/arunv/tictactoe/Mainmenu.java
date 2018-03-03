package com.example.arunv.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends AppCompatActivity {

    Button start,help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        start= (Button) findViewById(R.id.start);
        help= (Button) findViewById(R.id.help);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Mainmenu.this,MainActivity.class);
                startActivity(intent);

            }
        });


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Mainmenu.this,HelpWindow.class);
                startActivity(intent);

            }
        });

    }
}
