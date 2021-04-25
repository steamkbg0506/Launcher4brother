package com.example.mtkluncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mbutton;
    Button mbutton1;
    Button mbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = findViewById(R.id.button);
        mbutton1 = findViewById(R.id.button2);
        mbutton2 = findViewById(R.id.button3);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"리틀팍스", Toast.LENGTH_SHORT).show();
                //코드 작성
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("net.littlefox.lf_app_fragment");
                startActivity(launchIntent);
            }
        });

        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"파파고", Toast.LENGTH_SHORT).show();
                //코드 작성
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.naver.labs.translator");
                startActivity(launchIntent);
            }
        });

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"개발자 전용", Toast.LENGTH_SHORT).show();
                //코드 작성
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("de.szalkowski.activitylauncher");
                startActivity(launchIntent);
            }
        });

    }
}