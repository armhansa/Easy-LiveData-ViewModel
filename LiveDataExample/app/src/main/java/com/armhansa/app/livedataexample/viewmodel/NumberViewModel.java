package com.armhansa.app.livedataexample.viewmodel;

import android.arch.lifecycle.ViewModel;

public class NumberViewModel extends ViewModel {

//    private MyNumber myNum;
    private String myNum;

    public String getMyNum() {
        if(myNum == null) {
//            myNum = MyNumber.getInstance();
            myNum = "NULL";
        }
        return myNum;
    }

    public void setMyNum(String myNum) {
        this.myNum = myNum;
    }

    //    private void getData() {
//        if(myNum.getNumber() == null) {
//            myNum.setNumber("NULL");
//        }
//    }

}
