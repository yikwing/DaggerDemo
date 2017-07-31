package com.rongyi.myapplication;

import dagger.Component;

/**
 * Created by rongyi on 2017/7/31.
 */


@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(CarDagger car);
}
