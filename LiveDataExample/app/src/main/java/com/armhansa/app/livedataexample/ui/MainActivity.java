package com.armhansa.app.livedataexample.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
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

        text = findViewById(R.id.text);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChangeNum.class));
            }
        });


        // Get the ViewModel.
        myNumber = ViewModelProviders.of(this).get(NumberViewModel.class);

        // Create the observer which updates the UI.
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // Update the UI, in this case, a TextView
                text.setText(s);
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        myNumber.getMyNum().observe(this, nameObserver);


    }

}
