package com.example.casonacastaares;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    Button button1, button2, button3, button4, buttonCreditos;
    ImageButton imageButton1, imageButton2, imageButton3, imageButton4;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        setContentView(R.layout.activity_main);
        typeface = Typeface.createFromAsset(getAssets(), "fonts/oswald_bold.ttf");

        button1 = findViewById(R.id.main_activity_button_1);
        button2 = findViewById(R.id.main_activity_button_2);
        button3 = findViewById(R.id.main_activity_button_3);
        button4 = findViewById(R.id.main_activity_button_4);
        buttonCreditos = findViewById(R.id.main_activity_button_creditos);
        imageButton1 = findViewById(R.id.main_activity_iamge_button_1);
        imageButton2 = findViewById(R.id.main_activity_iamge_button_2);
        imageButton3 = findViewById(R.id.main_activity_iamge_button_3);
        imageButton4 = findViewById(R.id.main_activity_iamge_button_4);
        button1.setTypeface(typeface);
        button2.setTypeface(typeface);
        button3.setTypeface(typeface);
        button4.setTypeface(typeface);
        buttonCreditos.setTypeface(typeface);

        buttonCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ScreenCreditos.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 1);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 2);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 3);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 4);
                startActivity(intent);
            }
        });




        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 1);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 2);
                startActivity(intent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 3);
                startActivity(intent);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen2Activity.class);
                intent.putExtra("character", 4);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }
}
