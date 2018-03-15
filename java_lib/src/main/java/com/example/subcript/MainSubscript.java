package com.example.subcript;

/**
 * Created by SongUp on 2018/3/14.
 */

public class MainSubscript {
    public static void main(String arg[]){
        //观察者
        ObserveRealize observeRealize01 = new ObserveRealize("观察者一");
        ObserveRealize observeRealize02 = new ObserveRealize("观察者二");
        ObserveRealize observeRealize03 = new ObserveRealize("观察者三");
        ObserveRealize observeRealize04 = new ObserveRealize("观察者四");

        //被观察者
        SubscriptRealize subscriptRealize = new SubscriptRealize();
        subscriptRealize.attach(observeRealize01);
        subscriptRealize.attach(observeRealize02);
        subscriptRealize.attach(observeRealize03);
        subscriptRealize.attach(observeRealize04);
//通知更新
        subscriptRealize.notifyObsever("该更新啦");
    }
}
