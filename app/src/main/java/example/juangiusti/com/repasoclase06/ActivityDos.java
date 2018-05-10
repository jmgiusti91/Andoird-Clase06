package example.juangiusti.com.repasoclase06;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ActivityDos extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Repasin");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
