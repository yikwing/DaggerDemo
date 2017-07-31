package com.rongyi.myapplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rongyi on 2017/7/31.
 */


@Module
public class CarModule {

    @Provides
    public Engine provideEngine() {

        return new Engine();
    }

    @Provides
    public Seat provideSeat(Leather leather) {

        return new Seat(leather);
    }

    @Provides
    public Wheel provideWheel() {
        return new Wheel();
    }

    @Provides
    public Leather provideLeather() {
        return new Leather();
    }

    @LeatherColor(color = "black")
    @Provides
    public Leather provideIntLeather() {
        return new Leather("black");
    }
}