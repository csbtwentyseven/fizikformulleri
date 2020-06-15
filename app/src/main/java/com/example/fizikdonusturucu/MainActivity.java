package com.example.fizikdonusturucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] menusecenek = {"Kinetik Enerji Hesaplayıcı","Potansiyel Enerji Hesaplayıcı","Çizgisel Momentum Hesaplayıcı","Sürütnme Kuvveti Hesaplayıcı","İvme Hesaplayıcı","Potansiyel Enerji -> Kinetik Enerji","Kinetik Enerji -> Potansiyel Enerji","Momentum -> Kinetik Enerji","Kinetik Enerji -> Momentum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//ListView Kurulumu
        ListView menuliste = findViewById(R.id.anamenu);
        ArrayAdapter<String> veri_adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, menusecenek);
        menuliste.setAdapter(veri_adaptor);
//Son
        menuliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(),KinetikHesap.class); // this çalışmıyor.getApplicationContext() kullan.
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(),PotansiyelHesap.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(),CizgiselMomentumHesap.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(),SurtunmeKuvvetiHesap.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(),IvmeHesap.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(),PotKinDonusturucu.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(),KinPotDonusturucu.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(),MomKinDonusturucu.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(),KinMomDonusturucu.class);
                        startActivity(intent);
                        break;
                }

            }
        });

    }
}
