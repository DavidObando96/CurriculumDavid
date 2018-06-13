package com.example.quezada.curriculum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InformacionExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_extra);

    }

    public void regresar(View view){
        Intent intent = new Intent(this,Principal.class);
        startActivity(intent);
    }


}
