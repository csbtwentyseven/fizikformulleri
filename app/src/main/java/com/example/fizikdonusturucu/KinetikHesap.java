package com.example.fizikdonusturucu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KinetikHesap extends AppCompatActivity {
    EditText kutlegiri;
    EditText hizgiri;
    TextView sonuc;
    Button dugme;
    double kutleDeger;
    double hizDeger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetik_hesap);

        kutlegiri = findViewById(R.id.kutlegiri);
        hizgiri = findViewById(R.id.hizgiri);
        sonuc = findViewById(R.id.ciktilabel);
        dugme = findViewById(R.id.button);


        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kutleDeger = Double.parseDouble(kutlegiri.getText().toString());
                hizDeger = Double.parseDouble(hizgiri.getText().toString());

                final HesapCls hesapCls = new HesapCls(kutleDeger,hizDeger);

                sonuc.setText(hesapCls.getKinDeger() + " " + getString(R.string.joule));
            }
        });
    }


}
