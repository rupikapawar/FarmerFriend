package com.example.rupik.farmerfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "fuck off", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "fuck off", Toast.LENGTH_SHORT).show();

        System.out.print("Hello world");

    }
}

