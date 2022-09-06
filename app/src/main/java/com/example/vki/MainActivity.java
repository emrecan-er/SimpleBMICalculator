package com.example.vki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText kiloText;
    EditText boyText;
    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kiloText = findViewById(R.id.kiloText);
        boyText= findViewById(R.id.boyText);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
    }


    public void hesapla(View view) {
        float kilo = Float.parseFloat(kiloText.getText().toString());
        float boy = Float.parseFloat(boyText.getText().toString());
        float sonuc = kilo / (boy * boy);
        textView.setText("VKI : " + sonuc);
        if (sonuc < 18.5) {
            textView2.setText("Sonuc : Zayif");
        } else if (sonuc >= 18.5 && sonuc < 24.9) {
            textView2.setText("Sonuc : Normal");

        } else if (sonuc <= 24.9 && sonuc < 29.9) {
            textView2.setText("Sonuc : Kilolu");
        } else if (sonuc <= 29.9 && sonuc < 34.9) {
            textView2.setText("Sonuc : Obez");
        } else {
            textView2.setText("Sonuc : Morbid Obez");

        }
    }

}