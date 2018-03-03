package com.example.android.benchmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonOne, buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button)  findViewById(R.id.button);
        buttonTwo = (Button)  findViewById(R.id.button2);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSetup();
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoad();
            }
        });
    }
    public void openSetup(){
        Intent intent = new Intent(this, Setup.class);
        startActivity(intent);
    }
    public void openLoad(){
        Intent intent = new Intent(this, Load.class);
        startActivity(intent);
    }
}