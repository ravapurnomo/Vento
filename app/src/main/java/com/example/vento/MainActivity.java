package com.example.vento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "It's Not Working" );
    }

    public void disable(View v) {
        v.setEnabled(false);
        Log.d("success", "Button Disabled" );
    }
}