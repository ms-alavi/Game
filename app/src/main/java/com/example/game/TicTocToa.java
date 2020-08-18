package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class TicTocToa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_toc_toa);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.frg_ticTocToa_container);

        if (fragment == null) {
            TicTocToaFragment ticTocToaFragment = new TicTocToaFragment();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frg_ticTocToa_container, ticTocToaFragment)
                    .commit();
        }
    }
}