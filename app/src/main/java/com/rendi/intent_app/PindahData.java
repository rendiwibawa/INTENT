package com.rendi.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahData extends AppCompatActivity {
    public static final String EXTRANAME ="extra_name";
    public static final String EXTRAAGE="extra_age";
    public static final String EXTRALO="extra_age";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_data);

        TextView tampilDataDiterima = findViewById(R.id.tampil_DataDiTerima);
        String love = getIntent().getStringExtra(EXTRALO);
        String name = getIntent().getStringExtra(EXTRANAME);
        int age = getIntent().getIntExtra(EXTRAAGE,0);

        String text = "Name : " + name +  "\n" +"Age : "+ age;
        tampilDataDiterima.setText(text);


    }
}
