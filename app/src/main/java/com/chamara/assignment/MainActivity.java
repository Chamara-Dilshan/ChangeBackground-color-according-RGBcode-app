package com.chamara.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getColorVal(View v){
        TextView r = findViewById(R.id.editTNum1);
        TextView b = findViewById(R.id.editTNum2);
        TextView g = findViewById(R.id.editTNum3);


        try {
            int red =Integer.parseInt(r.getText().toString());
            int green =Integer.parseInt(g.getText().toString());
            int blue =Integer.parseInt(b.getText().toString());

            if(red < 0 || red > 255 ||
                    green < 0 || green > 255||
                    blue < 0 || blue > 255)
                throw new NumberFormatException("Color value should be within 0-255");

            int color = Color.argb(255,red,green,blue);
            findViewById(R.id.main).setBackgroundColor(color);
        } catch (NumberFormatException e) {
            Toast.makeText(r.getContext(),"Invalid Input : \n"+e.getMessage(),Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}