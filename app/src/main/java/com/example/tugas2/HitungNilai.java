package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungNilai extends AppCompatActivity {
    EditText Nama,Absensi,Kuis,Tugas,UTS,UAS;
    Button btHasil,btHapus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_nilai);

        Nama=(EditText) findViewById(R.id.eTNama);
        Absensi=(EditText) findViewById(R.id.eTAbsen);
        Kuis=(EditText) findViewById(R.id.eTKuis);
        Tugas=(EditText) findViewById(R.id.eTTugas);
        UTS=(EditText) findViewById(R.id.eTUTS);
        UAS=(EditText) findViewById(R.id.eTUAS);

        btHasil=(Button) findViewById(R.id.buttonHasil);
        btHapus=(Button) findViewById(R.id.buttonHapus);

        btHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HitungNilai.this,HitungNilai2.class);
                intent.putExtra("Namaku",Nama.getText().toString());
                intent.putExtra("Absenku",Float.parseFloat(Absensi.getText().toString()));
                intent.putExtra("ValK",Float.parseFloat(Kuis.getText().toString()));
                intent.putExtra("ValT",Float.parseFloat(Tugas.getText().toString()));
                intent.putExtra("ValUT",Float.parseFloat(UTS.getText().toString()));
                intent.putExtra("ValUA",Float.parseFloat(UAS.getText().toString()));
                startActivity(intent);
            }
        });

        btHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Nama.setText("");
            Absensi.setText("");
            Kuis.setText("");
            Tugas.setText("");
            UTS.setText("");
            UAS.setText("");
        }});

    }
}