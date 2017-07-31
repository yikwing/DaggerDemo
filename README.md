## Dagger Demo

> [Dagger 简书资料](http://www.jianshu.com/p/dce5382fec5d)


1. Module

```java
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
```
2. Component
```java
@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(CarDagger car);
}

```

3. Dagger
```java
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
```

4. Qualifier过滤器
```java
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface LeatherColor {
    String color();
}
```

<img src="https://raw.githubusercontent.com/yikwing/ljkplayer_demo/master/image/qrcode.gif" width="600" height="500">
