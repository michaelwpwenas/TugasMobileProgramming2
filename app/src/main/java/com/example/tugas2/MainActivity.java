package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btSendVarIntent,btHitungNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSendVarIntent=(Button) findViewById(R.id.buttonSendVarIntent);
        btHitungNilai=(Button) findViewById(R.id.buttonHitungNilai);

        btSendVarIntent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, SendVarIntent.class);
                startActivity(intent);
            }});

                btHitungNilai.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick (View view) {
                        Intent intent=new Intent(MainActivity.this,HitungNilai.class);
                        startActivity(intent);
    }});
}}