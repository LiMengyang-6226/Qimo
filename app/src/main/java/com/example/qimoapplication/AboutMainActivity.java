package com.example.qimoapplication;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AboutMainActivity extends AppCompatActivity {
    private Button cometo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_main);
        cometo=(Button)findViewById(R.id.cometo);
    }

}