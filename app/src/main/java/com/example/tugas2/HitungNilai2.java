package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HitungNilai2 extends AppCompatActivity {
    TextView TAbsen,TTugas,TKuis,TUTS,TUAS,TTotal,Kesimpulan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_nilai2);

        TAbsen=(TextView) findViewById(R.id.tvAbsensi);
        TTugas=(TextView) findViewById(R.id.tvTugas);
        TKuis=(TextView) findViewById(R.id.tvKuis);
        TUTS=(TextView) findViewById(R.id.tvUTS);
        TUAS=(TextView) findViewById(R.id.tvUAS);
        TTotal=(TextView) findViewById(R.id.tvNTotal);
        Kesimpulan=(TextView) findViewById(R.id.tvHasil);

        Intent intent=getIntent();
        float N_Absen=intent.getFloatExtra("Absenku",0);
        float N_Tugas=intent.getFloatExtra("ValT",0);
        float N_Kuis=intent.getFloatExtra("ValK",0);
        float N_UTS=intent.getFloatExtra("ValUT",0);
        float N_UAS=intent.getFloatExtra("ValUA",0);

        double N_Total=(N_Absen*0.15)+(N_Tugas*0.15)+(N_Kuis*0.16)+(N_UTS*0.16)+(N_UAS*0.21);

        TAbsen.setText(String.valueOf(N_Absen));
        TTugas.setText(String.valueOf(N_Tugas));
        TKuis.setText(String.valueOf(N_Kuis));
        TUTS.setText(String.valueOf(N_UTS));
        TUAS.setText(String.valueOf(N_UAS));
        TTotal.setText(String.valueOf(N_Total));

        if (N_Total>58) {
            Kesimpulan.setText("LULUS");
        } else {
            Kesimpulan.setText("TIDAK LULUS");
        }

    }
}