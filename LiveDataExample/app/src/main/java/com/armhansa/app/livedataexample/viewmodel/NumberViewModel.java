package com.armhansa.app.livedataexample.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


public class NumberViewModel extends ViewModel {

//    private MyNumber myNum;
    private MutableLiveData<String> myNum;

    public MutableLiveData<String> getMyNum() {
        if(myNum == null) {
//            myNum = MyNumber.getInstance();
            myNum = new MutableLiveData<>();
        }
        return myNum;
    }

    //    private void getData() {
//        if(myNum.getNumber() == null) {
//            myNum.setNumber("NULL");
//        }
//    }

}
