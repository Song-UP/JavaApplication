package com.example.subcript;

/**
 * Created by SongUp on 2018/3/14.
 */
//观察者
interface Observe{
    void upData(String message);
}

//观察者实现类
public class ObserveRealize implements Observe{
    private String name;

    public ObserveRealize(String name) {
        this.name = name;
    }

    @Override
    public void upData(String message) {
//        收到跟新信息
        System.out.println(name+"收到的信息是："+message);
    }
}
