package com.rongyi.myapplication;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by rongyi on 2017/7/31.
 */

public class CarDagger {
    @Inject
    Engine mEngine;

    @Inject
    Wheel mWheel;

    @Inject
    Seat mSeat;

    @LeatherColor(color = "black")
    @Inject
    Leather leather;

    public CarDagger() {

        DaggerCarComponent.builder().carModule(new CarModule()).build().inject(this);

        Log.d("this", "new 车");
    }


}
