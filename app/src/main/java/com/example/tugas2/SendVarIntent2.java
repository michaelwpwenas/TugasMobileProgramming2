package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SendVarIntent2 extends AppCompatActivity {
    TextView TNama,TNilaiA,TNilaiB,THasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_var_intent2);

        TNama=(TextView) findViewById(R.id.tvNama);
        TNilaiA=(TextView) findViewById(R.id.tvNilaiA);
        TNilaiB=(TextView) findViewById(R.id.tvNilaiB);
        THasil=(TextView) findViewById(R.id.tvHasilTambah);

        Intent intent = getIntent();
        String NameP=intent.getStringExtra("MyName").toString();
        float Nilai_A=intent.getFloatExtra("ValA",0);
        float Nilai_B=intent.getFloatExtra("ValB",0);
        float Hasil=Nilai_A+Nilai_B;

        TNama.setText(NameP);
        TNilaiA.setText(String.valueOf(Nilai_A));
        TNilaiB.setText(String.valueOf(Nilai_B));
        THasil.setText(String.valueOf(Hasil));

    }
}