package com.example.botonesdeaccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem Item){
        int id = Item.getItemId();

        if(id == R.id.phone){
            Toast.makeText(this, "Se presiono el icono de Teléfono", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id == R.id.camera){
            Toast.makeText(this, "Se presiono el icono de Cámara", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id == R.id.opcion1){
            Toast.makeText(this, "Se presiono la opcion 1", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id == R.id.opcion2){
            Toast.makeText(this, "Se presiono la opcion 2", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id == R.id.opcion3){
            Toast.makeText(this, "Se presiono la opcion 3", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(Item);
    }

}