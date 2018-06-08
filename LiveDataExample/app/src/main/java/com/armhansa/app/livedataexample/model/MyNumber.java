package com.armhansa.app.livedataexample.model;

public class MyNumber {

    // Make Singleton Class
    private static MyNumber myNumber;

    // Real Data
    private String number;

    private MyNumber() {
    }
    public static MyNumber getInstance() {
        if(myNumber == null) {
            myNumber = new MyNumber();
        }
        return myNumber;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

}
