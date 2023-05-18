package com.example.depremyardim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
public class yardimAl extends AppCompatActivity {

    private Button cadirVeKonteynir;
    private Button saglikHizmeti;
    private Button malzemeYardimi;
    private Button geri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yardim_al);
        cadirVeKonteynir = findViewById(R.id.btn_cadir_ve_konteynir);
        saglikHizmeti = findViewById(R.id.btn_saglik_hizmeti);
        malzemeYardimi = findViewById(R.id.btn_mazleme_yardimi);
        geri = findViewById(R.id.btn_back);

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        cadirVeKonteynir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCadirBarinak();
            }
        });

        saglikHizmeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaglikHizmeti();
            }
        });

        malzemeYardimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMalzemeYardimi();
            }
        });



    }
    private void openCadirBarinak() {

        Intent intent = new Intent(yardimAl.this, cadirlarVeKonteynirlar.class);
        startActivity(intent);
    }

    private void openSaglikHizmeti() {
        Intent intent = new Intent(yardimAl.this, saglikHizmetleri.class);
        startActivity(intent);
    }

    private void openMalzemeYardimi() {
        Intent intent = new Intent(yardimAl.this, malzemeYardimi.class);
        startActivity(intent);
    }
}
