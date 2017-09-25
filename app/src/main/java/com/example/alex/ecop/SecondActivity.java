package com.example.alex.ecop;

import android.content.Intent;
import android.content.Context;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void goToActivity2 (View view){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getBaseContext(), "Your input has been saved!" , Toast.LENGTH_SHORT ).show();
    }
    public void goToActivity3 (View view){
        Intent intent = new Intent (SecondActivity.this, ThirdActivity.class);
        startActivity(intent);

    }
}


