package com.example.sumey.mesebilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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

    //ürün sayfalarının açılmassı

    public void urun1(View view){
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(intent);
    }

    public void urun2(View view){
        Intent intent=new Intent(getApplicationContext(),Main5Activity.class);
        startActivity(intent);
    }

    public void urun3(View view){
        Intent intent=new Intent(getApplicationContext(),Main6Activity.class);
        startActivity(intent);
    }

    public void urun4(View view){
        Intent intent=new Intent(getApplicationContext(),Main7Activity.class);
        startActivity(intent);
    }

    public void urun5(View view){
        Intent intent=new Intent(getApplicationContext(),Main8Activity.class);
        startActivity(intent);
    }

    public void urun6(View view){
        Intent intent=new Intent(getApplicationContext(),Main9Activity.class);
        startActivity(intent);
    }

    public void urun7(View view){
        Intent intent=new Intent(getApplicationContext(),Main10Activity.class);
        startActivity(intent);
    }

    public void urun8(View view){
        Intent intent=new Intent(getApplicationContext(),Main11Activity.class);
        startActivity(intent);
    }

    public void urun9(View view){
        Intent intent=new Intent(getApplicationContext(),Main12Activity.class);
        startActivity(intent);
    }


}
