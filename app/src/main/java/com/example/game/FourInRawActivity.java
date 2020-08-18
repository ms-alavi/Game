package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class FourInRawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_in_raw);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.frg_fourInRaw_container);

        if (fragment == null) {
            FourInRawFragment fourInRawFragment = new FourInRawFragment();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frg_fourInRaw_container, fourInRawFragment)
                    .commit();
        }
    }
}