package facci.kevincastro.creandoeventos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        final FloatingActionButton fab = findViewById(R.id.flo_btn);

        final HomeFragment homeFragment = new HomeFragment();
        final FavFragment favFragment = new FavFragment();
        final EventFragment eventFragment = new EventFragment();
        final PerfilFragment perfilFragment = new PerfilFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();
                if (id == R.id.home){
                    setFragment(homeFragment);
                    return true;
                }else if (id == R.id.favorite){
                    setFragment(favFragment);
                    return true;
                }else if (id == R.id.creados){
                    setFragment(eventFragment);
                    return true;
                }else if (id == R.id.perfil){
                    setFragment(perfilFragment);
                    return true;
                }
                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.home);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this, CrearEventoActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
