package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_Restoran =
            "com.example.android.studycase.extra.Restoran";
    public static final String EXTRA_Menu =
            "com.example.android.studycase.extra.Menu";
    public static final String EXTRA_Porsi =
            "com.example.android.studycase.extra.Porsi";
    public static final String EXTRA_Harga =
            "com.example.android.studycase.extra.Harga";

    EditText inputNamaMenu, inputPorsi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNamaMenu = (EditText) findViewById(R.id.labelNamaMenu);
        inputPorsi = (EditText) findViewById(R.id.labelPorsi);

    }
    public void MenuEatbus (View V){

        String nama = inputNamaMenu.getText().toString();
        String porsi = inputPorsi.getText().toString();
        Intent SeconActivity = new Intent(this,SecondActivity.class);
        SeconActivity.putExtra(EXTRA_Restoran,"Eatbus");
        SeconActivity.putExtra(EXTRA_Menu,nama);
        SeconActivity.putExtra(EXTRA_Porsi,porsi);

        startActivity(SeconActivity);
    }

    public void MenuAbnormal (View V) {

        String nama = inputNamaMenu.getText().toString();
        String porsi = inputPorsi.getText().toString();
        Intent SeconActivity = new Intent(this,SecondActivity.class);
        SeconActivity.putExtra(EXTRA_Restoran,"Abnormal");
        SeconActivity.putExtra(EXTRA_Menu,nama);
        SeconActivity.putExtra(EXTRA_Porsi,porsi);

        startActivity(SeconActivity);
    }
}



