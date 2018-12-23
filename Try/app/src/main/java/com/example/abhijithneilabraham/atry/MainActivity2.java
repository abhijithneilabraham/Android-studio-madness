package com.example.abhijithneilabraham.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.abhijithneilabraham.atry.ui.fragment1.Fragment1;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment1.newInstance())
                    .commitNow();
        }
    }
}
