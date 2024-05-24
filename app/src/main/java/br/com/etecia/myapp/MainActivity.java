package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavView;
    MaterialToolbar idTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // apresentando o xml para o java
        bottomNavView = findViewById(R.id.bottomNavView);
        idTopBar = findViewById(R.id.idTopBar);
        idTopBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Voltar", Toast.LENGTH_SHORT).show();
            }
        });

        //criar evento de idTopBar
        idTopBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.mFav) {
                    Toast.makeText(getApplicationContext(),
                            "Favorite", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mLocation) {
                    Toast.makeText(getApplicationContext(),
                            "Location", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mCloud) {
                    Toast.makeText(getApplicationContext(),
                            "Cloud", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mExplore) {
                    Toast.makeText(getApplicationContext(),
                            "Explore", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSearch) {
                    Toast.makeText(getApplicationContext(),
                            "Search", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mShare) {
                    Toast.makeText(getApplicationContext(),
                            "Share", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });


        //criando evento de clique nos itens
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.mNews) {
                    Toast.makeText(getApplicationContext(), "Cliquei em News", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mGlobal) {
                    Toast.makeText(getApplicationContext(), "Cliquei em Global", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mForYou) {
                    Toast.makeText(getApplicationContext(), "Cliquei em For You", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mTrendings) {
                    Toast.makeText(getApplicationContext(), "Cliquei em Trendings", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}