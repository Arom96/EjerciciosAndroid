package com.example.dibujartexto;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.content.pm.PackageInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
        getSupportActionBar().hide();
    }

    class Lienzo extends View {
        public Lienzo(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            canvas.drawRGB(0,0,255);
            Paint pincell = new Paint();
            pincell.setARGB(255,255,0,0);
            pincell.setTextSize(30);
            pincell.setTypeface(Typeface.SERIF);
            canvas.drawText("Aaron Cruz (SERIF)",0,70,pincell);
            pincell.setTypeface(Typeface.SANS_SERIF);
            canvas.drawText("Tópicos Especiales (SANS SERIF)",0,100,pincell);
            pincell.setTypeface(Typeface.MONOSPACE);
            canvas.drawText("ESFOT", 0,140, pincell);
            Typeface tf = Typeface.create(Typeface.SERIF, Typeface.ITALIC);
            pincell.setTypeface(tf);
            canvas.drawText("EJERCICIOS ANDROID",0,180,pincell);
            tf = Typeface.create(Typeface.SERIF, Typeface.ITALIC|Typeface.BOLD);

            pincell.setTypeface(tf);
            canvas.drawText("TERMINADO",0,220,pincell);

        }
    }
}