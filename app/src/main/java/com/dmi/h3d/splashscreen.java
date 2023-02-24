package com.dmi.h3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {
    private Handler handler =new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {


            Toast.makeText(splashscreen.this, "Добро пожаловать !", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();

        }
    };
        @Override
        protected void onResume() {
            super.onResume();
            handler.postDelayed(runnable, 350);
        }

        @Override
        protected void onPause() {
            super.onPause();
            handler.removeCallbacks(runnable);
        }
    }
