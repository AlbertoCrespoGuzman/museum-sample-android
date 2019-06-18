package com.example.casonacastaares;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Screen2Activity extends Activity {

    Button buttonBio, buttonBattle;
    Typeface typeface, typefaceText;
    int character;
    ImageView titleImage, bodyImage;
    TextView textCharacter;
    ImageButton buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);


        setContentView(R.layout.activity_screen2);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/oswald_bold.ttf");
        typefaceText = Typeface.createFromAsset(getAssets(), "fonts/opensans_regular.ttf");

        character = getIntent().getIntExtra("character", 0);

        buttonBio = findViewById(R.id.screen2_button_video_bio);
        buttonBattle = findViewById(R.id.screen2_button_video_battle);
        titleImage = findViewById(R.id.activity_screen2_title);
        bodyImage = findViewById(R.id.activity_screen2_body);
        textCharacter = findViewById(R.id.activity_screen2_text);
        buttonBack = findViewById(R.id.activity_screen2_button_back);


        buttonBio.setTypeface(typeface);
        buttonBattle.setTypeface(typeface);
        if(character == 3){
            buttonBattle.setVisibility(View.INVISIBLE);
        }
        textCharacter.setTypeface(typefaceText);

        switch (character){
            case 1:
                titleImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_1_title));
                textCharacter.setText(Html.fromHtml(getResources().getString(R.string.screen2_1_text)));
                bodyImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_1_body));
                break;
            case 2:
                titleImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_2_title));
                textCharacter.setText(Html.fromHtml(getResources().getString(R.string.screen2_2_text)));
                bodyImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_2_body));
                break;
            case 3:
                titleImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_3_title));
                textCharacter.setText(Html.fromHtml(getResources().getString(R.string.screen2_3_text)));
                bodyImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_3_body));
                break;
            case 4:
                titleImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_4_title));
                textCharacter.setText(Html.fromHtml(getResources().getString(R.string.screen2_4_text)));
                bodyImage.setImageDrawable(getResources().getDrawable(R.drawable.screen2_4_body));
                break;
        }

        buttonBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen3Activity.class);
                intent.putExtra("character", character);
                intent.putExtra("bioNotBattle",  "bio");
                startActivity(intent);
                finish();
            }
        });
        buttonBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Screen3Activity.class);
                intent.putExtra("character", character);
                intent.putExtra("bioNotBattle",  "battle");
                startActivity(intent);
                finish();

            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
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
