package divakynta.if5a.kulinerkita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bnvKulinerKita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bnvKulinerKita = findViewById(R.id.bnv_kuliner_kita);
        bnvKulinerKita.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId())
                    case R.id.menu_beranda
                        bukaFragment(new FragmentBeranda())
                return false;
            }
        });
    }

     private void bukaFragment(Fragment FRG){
         FragmentManager FM = getSupportFragmentManager();
         FragmentTransaction FT = FM.beginTransaction();
         FT.replace(R.id.fl_container, FRG);
         FT.commit();
     }

    public  boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return super.onCreateOptionsMenu(menu);

    }
}