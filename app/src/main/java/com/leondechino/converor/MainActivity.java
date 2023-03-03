package com.leondechino.converor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    fragmentTemperature f_temperature = new fragmentTemperature();
    fragmentWeight f_weight = new fragmentWeight();
    fragmentVolume f_volume = new fragmentVolume();
    fragmentLenght f_lenght = new fragmentLenght();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, f_temperature).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navtemperature:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_temperature).commit();return true;
                    case R.id.navweight:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_weight).commit();return true;
                    case R.id.navvolume:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_volume).commit();return true;
                    case R.id.navlenght:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_lenght).commit();return true;
                }
                return false;
            }
        });
    }
}