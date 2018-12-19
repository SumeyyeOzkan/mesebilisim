package com.example.sumey.mesebilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
    public void geri2(View view){
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(intent);
    }

    public void ileri2(View view){
        Intent intent = new Intent(getApplicationContext(), Main6Activity.class);
        startActivity(intent);
    }

}
