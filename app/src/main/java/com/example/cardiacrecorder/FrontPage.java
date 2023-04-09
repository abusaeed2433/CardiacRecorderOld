package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.cardiacrecorder.databinding.ActivityFrontPageBinding;

public class FrontPage extends AppCompatActivity {

    private ActivityFrontPageBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFrontPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler(Looper.getMainLooper()).postDelayed(() ->
                startActivity(new Intent(FrontPage.this,HomePage.class)),3000
        );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}