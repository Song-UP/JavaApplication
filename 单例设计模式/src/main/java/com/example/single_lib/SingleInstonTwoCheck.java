package com.example.single_lib;

/**
 * 普通单例设计模式
 */
public class SingleInstonTwoCheck {
    private SingleInstonTwoCheck(){
    }
    private static SingleInstonTwoCheck singleInstonTwoCheck;

    //双检测校验锁 单例
    private static SingleInstance_com getInstance01(){
        if (singleInstonTwoCheck == null){
            synchronized (SingleInstonTwoCheck.class){
                if (singleInstonTwoCheck == null){
                    singleInstonTwoCheck = new SingleInstonTwoCheck();
                }

            }
        }
        return singleInstonTwoCheck;

    }
}
