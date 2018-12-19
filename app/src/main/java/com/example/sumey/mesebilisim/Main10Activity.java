package com.example.sumey.mesebilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }

    public void clck3Anasayfa(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }

    public void clck3Hakkimizda(View view){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);

    }

    public void clck3Urun(View view){
        Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(intent);
    }

    //geri butonu
    public void geri4(View view){
        Intent intent = new Intent(getApplicationContext(), Main9Activity.class);
        startActivity(intent);
    }

    public void ileri4(View view){
        Intent intent = new Intent(getApplicationContext(), Main11Activity.class);
        startActivity(intent);
    }
}
