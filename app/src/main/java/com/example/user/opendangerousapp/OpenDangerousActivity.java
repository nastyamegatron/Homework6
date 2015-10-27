package com.example.user.opendangerousapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class OpenDangerousActivity extends AppCompatActivity {
    Button mBtnDangerous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mBtnDangerous=(Button)findViewById(R.id.dangerous);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_dangerous);

        mBtnDangerous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dangerousIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(dangerousIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_open_dangerous, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
