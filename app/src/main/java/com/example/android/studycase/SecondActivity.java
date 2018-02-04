package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public TextView Restoran;
    public TextView NamaMenu;
    public TextView PorsiMenu;
    public TextView HargaMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Restoran = (TextView)findViewById(R.id.labelRestoran);
        NamaMenu = (TextView)findViewById(R.id.labelMenu);
        PorsiMenu = (TextView)findViewById(R.id.labelPorsi);
        HargaMenu = (TextView)findViewById(R.id.labelHarga);
        Intent Inten = getIntent();
        String ExtraNamaRestoran = Inten.getStringExtra(MainActivity.EXTRA_Restoran);
        String ExtraNamaMenu = Inten.getStringExtra(MainActivity.EXTRA_Menu);
        String ExtraNamaPorsi = Inten.getStringExtra(MainActivity.EXTRA_Porsi);

        int uang = 65000;
        int harga=0;
        int porsi = Integer.parseInt(ExtraNamaPorsi);
        if("Eatbus".equals(ExtraNamaRestoran)){harga=30000*porsi;}
        else if("Abnormal".equals(ExtraNamaRestoran)){harga=50000*porsi;}
        if(harga>uang){Toast.makeText(this, "Jangan makan disini, kamu gakuat soalnya uang kamu gacukup",Toast.LENGTH_SHORT).show();}
        else{Toast.makeText(this, "Makan disini kamu kuat, soalnya uang kamu cukup",Toast.LENGTH_SHORT).show();}

        Restoran.setText(ExtraNamaRestoran);
        NamaMenu.setText(ExtraNamaMenu);
        PorsiMenu.setText(ExtraNamaPorsi);
        HargaMenu.setText(""+harga);

    }

}
