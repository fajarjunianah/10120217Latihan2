package com.example.a10120217latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// 25-04-2023, NIM:10120217, FAJAR JUNIANSAH SADIKIN, IF-6

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        Button veri = (Button) findViewById(R.id.veri);
        veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlmostThereActivity.this, VerifyAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
