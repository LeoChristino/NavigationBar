package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // apresentando o xml para o java
        bottomNavView = findViewById(R.id.bottomNavView);
        //criando evento de clique nos itens
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mNews:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em News", Toast.LENGTH_SHORT).show();
                        ;
                        break;

                       switch (item.getItemId()) {
                        case R.id.mGlobal:
                            Toast.makeText(getApplicationContext(),
                                    "Cliquei em Global", Toast.LENGTH_SHORT).show();
                            ;
                            break;

                        switch (item.getItemId()) {
                            case R.id.mForYou:
                                Toast.makeText(getApplicationContext(),
                                        "Cliquei em For You", Toast.LENGTH_SHORT).show();
                                ;
                                break;

                            switch (item.getItemId()) {
                                case R.id.mTrendings:
                                    Toast.makeText(getApplicationContext(),
                                            "Cliquei em Trendings", Toast.LENGTH_SHORT).show();
                                    ;
                                    break;

                            }
                            return false;
                        }
                    });
                }
            }