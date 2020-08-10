package com.rendi.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnMoveActyvity = findViewById(R.id.btn_move_actyvity);
        btnMoveActyvity.setOnClickListener(this);

        Button btnMoveWithData = findViewById(R.id.btn_move_actyvity_data);
        btnMoveWithData.setOnClickListener(this);

        Button btnDial = findViewById(R.id.btn_dial_number);
        btnDial.setOnClickListener(this);

        Button btnTerima = findViewById(R.id.btn_data_recivered);
        btnTerima.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_actyvity:
                Intent moIntent = new Intent(MainActivity.this , PindahActivity.class);
                startActivity(moIntent);
                break;
            case R.id.btn_move_actyvity_data:
                Intent moveData= new Intent(MainActivity.this, PindahData.class);
                moveData.putExtra(PindahData.EXTRANAME,"RENDI");
                moveData.putExtra(PindahData.EXTRAAGE,17);
                startActivity(moveData);
                break;
            case R.id.btn_dial_number:
                String Wa= "083834454000";
                Intent noWa = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Wa));
                startActivity(noWa);
                break;
            case R.id.btn_data_recivered:
                Intent kirim = new Intent(MainActivity.this, MainActivity.class);
                break;
        }

    }


}
