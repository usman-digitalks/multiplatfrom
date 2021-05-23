package me.oiz.multiplatfrom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.oiz.allplatform.allplatformClass;

import com.example.multiplatfrom.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allplatformClass.tagEvent(this);

    }
}