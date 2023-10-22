package com.openclassrooms.arista.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.openclassrooms.arista.R;

import androidx.fragment.app.Fragment;

import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.openclassrooms.arista.databinding.ActivityMainBinding;
import com.openclassrooms.arista.ui.exercise.ExerciseFragment;
import com.openclassrooms.arista.ui.sleep.SleepFragment;
import com.openclassrooms.arista.ui.user.UserDataFragment;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.bottomNavigation.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UserDataFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        Fragment selectedFragment = null;

        if (item.getItemId() == R.id.nav_user_data) {
            selectedFragment = new UserDataFragment();
        } else if (item.getItemId() == R.id.nav_exercise) {
            selectedFragment = new ExerciseFragment();
        } else if (item.getItemId() == R.id.nav_sleep) {
            selectedFragment = new SleepFragment();
        }

        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }

        return false;
    };
}
