package com.example.casonacastaares;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.core.text.HtmlCompat;

public class ScreenCreditos extends Activity {


    Typeface typeface, typefaceText;
    TextView textCharacter, textFooter;
    ImageButton buttonBack;
    String text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        setContentView(R.layout.activity_screen_creditos);

        text1 = "<p>VOCES</p>\n" +
                "<p>JUAN MANUEL BELGRANO&nbsp; Gustavo Garc&iacute;a<br />EUSTOQUIO D&Iacute;AZ VELEZ&nbsp; &nbsp;Leonardo Cook<br />JUANA AZURDUY &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Cristina Idiarte<br />&ldquo;CHOCOLATE&rdquo; SARAVIA&nbsp; &nbsp; &nbsp;Ismael Gudi&ntilde;o</p>\n" +
                "<p>GUIONES<br /> Secretaría de Turismo de la Municipalidad de Salta</p>" +
                "<p>ANIMACI&Oacute;N<br />Gonzalo Soto</p>" +
                "<p>PROGRAMACI&Oacute;N<br />Alberto Crespo</p>" +
                "<p>DISE&Ntilde;O DE PERSONAJES<br />Ismael Gudi&ntilde;o</p>" +
                "<p>COORDINACION IT<br />Claudio Pizetti</p>";

        typeface = Typeface.createFromAsset(getAssets(), "fonts/oswald_bold.ttf");
        typefaceText = Typeface.createFromAsset(getAssets(), "fonts/opensans_regular.ttf");

        textCharacter = findViewById(R.id.activity_screen_credtios_text);
        textFooter = findViewById(R.id.screen_creditos_footer);
        buttonBack = findViewById(R.id.activity_screen_creditos_button_back);

        textCharacter.setTypeface(typefaceText);
        textFooter.setTypeface(typefaceText);

        textCharacter.setText(HtmlCompat.fromHtml(text1, 0));



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