package com.armhansa.app.livedataexample.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.armhansa.app.livedataexample.R;
import com.armhansa.app.livedataexample.viewmodel.NumberViewModel;

public class ChangeNum extends AppCompatActivity {

    private static final String TAG = "ChangeNum";

    private NumberViewModel myNumber;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_num);

        text = findViewById(R.id.text);

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

    public void changeToZero(View view) {
        changeNum(0);
    }

    public void changeToOne(View view) {
        changeNum(1);
    }

    public void changeToTwo(View view) {
        changeNum(2);
    }

    public void changeToThree(View view) {
        changeNum(3);
    }

    public void changeToFour(View view) {
        changeNum(4);
    }

    public void changeNum(int newNum) {
        myNumber.getMyNum().setValue(String.valueOf(newNum));
        Log.d(TAG, "OnClick: Change To "+myNumber.getMyNum());

    }
}
