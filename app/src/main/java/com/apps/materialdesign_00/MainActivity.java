package com.apps.materialdesign_00;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar  = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu,This will add items to the toolbar .
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle Action bar item clicks Here
        int id = item.getItemId();

        if (id == R.id.action_settings){
            Toast.makeText(getApplicationContext(),"Settings Clicked",Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_location){
            Toast.makeText(getApplicationContext(),"Location Clicked",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
