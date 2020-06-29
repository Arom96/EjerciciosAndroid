package com.example.textosobrecamino;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
            canvas.drawRGB(0,0, 255);
            int alto = canvas.getHeight();

            Path camino = new Path();
            camino.moveTo(0, alto/2);
            camino.lineTo(40,alto/2-30);
            camino.lineTo(80,alto/2-60);
            camino.lineTo(120,alto/2-90);
            camino.lineTo(160,alto/2-120);
            camino.lineTo(220,alto/2-150);
            camino.lineTo(280,alto/2-180);
            camino.lineTo(340,alto/2-210);
            Paint pincel = new Paint();
            pincel.setARGB(255,255,0,0);
            pincel.setTextSize(30);
            canvas.drawTextOnPath("ESFOT-Aaron Cruz", camino,0,0,pincel);

        }
    }


}