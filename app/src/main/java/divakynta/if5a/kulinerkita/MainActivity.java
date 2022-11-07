package divakynta.if5a.kulinerkita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public  boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top_option, menu);
        return super.onCreateOptionsMenu(menu);
    }
}