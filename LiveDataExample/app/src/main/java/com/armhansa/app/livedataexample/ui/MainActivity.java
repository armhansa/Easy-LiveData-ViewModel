package com.armhansa.app.livedataexample.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.armhansa.app.livedataexample.R;
import com.armhansa.app.livedataexample.viewmodel.NumberViewModel;

public class MainActivity extends AppCompatActivity {

    TextView text;
    FloatingActionButton fab;

    NumberViewModel myNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNumber = ViewModelProviders.of(this).get(NumberViewModel.class);
        myNumber.getMyNum();

        text = findViewById(R.id.text);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChangeNum.class));
            }
        });

    }

}
