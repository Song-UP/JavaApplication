package com.example.subcript;

import java.util.ArrayList;

/**
 * Created by SongUp on 2018/3/14.
 */

//被观察者抽象借口
interface Subject{
    abstract void attach(Observe observe);
    abstract void detach(Observe observe);
    abstract void notifyObsever(String message);
}

//被观察者实现类
public class SubscriptRealize implements Subject{
    private ArrayList<Observe> observeList;

    public SubscriptRealize() {
        this.observeList = new ArrayList<>();
    }

    @Override
    public void attach(Observe observe) {
        observeList.add(observe);
    }

    @Override
    public void detach(Observe observe) {
        observeList.remove(observe);
    }

    @Override
    public void notifyObsever(String message) {
        int length = observeList.size();
        for (int i=0; i<length; i++){
            observeList.get(i).upData(message);
        }
    }


}

