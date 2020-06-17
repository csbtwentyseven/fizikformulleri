package com.example.fizikdonusturucu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PotansiyelHesap extends AppCompatActivity {
    EditText kutlegiri;
    EditText yukseklikgiri;
    EditText yercekimigiri;
    Button dugme;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potansiyel_hesap);

        kutlegiri = findViewById(R.id.kutlegiri);
        yukseklikgiri = findViewById(R.id.yukseklikgiri);
        yercekimigiri = findViewById(R.id.yercekimigiri);
        dugme = findViewById(R.id.button);
        sonuc = findViewById(R.id.ciktilabel);

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double yukseklik = Double.parseDouble(yukseklikgiri.getText().toString());
                double kutle = Double.parseDouble(kutlegiri.getText().toString());
                double yercekimi = Double.parseDouble(yercekimigiri.getText().toString());
                final HesapCls hesapCls = new HesapCls(kutle,yercekimi,yukseklik);

                sonuc.setText(hesapCls.getPotDeger() + " "  + getString(R.string.joule));
            }
        });
    }
}
