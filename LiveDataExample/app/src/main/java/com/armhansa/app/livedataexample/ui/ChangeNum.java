package com.armhansa.app.livedataexample.ui;

import android.arch.lifecycle.ViewModelProviders;
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

        Log.d(TAG, "onCreate: New Create Number");

        myNumber = ViewModelProviders.of(this).get(NumberViewModel.class);
        myNumber.getMyNum();

        text = findViewById(R.id.text);
        text.setText(myNumber.getMyNum());
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

        myNumber.setMyNum(String.valueOf(newNum));
        Log.d(TAG, "OnClick: Change To "+myNumber.getMyNum());

        text.setText(myNumber.getMyNum());
    }
}
