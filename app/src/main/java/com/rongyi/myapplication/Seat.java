package com.rongyi.myapplication;

import android.util.Log;

public class Seat {

    private Leather leather;

    public Seat() {
        Log.d("this", "new Seat()");
    }

    public Seat(Leather leather) {
        this.leather = leather;
        Log.d("this", "new Seat(皮革)");
    }

}