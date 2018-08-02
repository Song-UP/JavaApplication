package com.example.single_lib;

/**
 * 普通单例设计模式
 */
public class SingleInstance_com {
    private SingleInstance(){
    }
    private static SingleInstance_com singleInstance_com01;

    //懒汉式
    private static SingleInstance_com getInstance01(){
        if (singleInstance_com01 == null){
            singleInstance_com01 = new SingleInstance_com();
        }
        return singleInstance_com01;

    }

    //饿汉子式
    private SingleInstance_com singleInstance_com02 = new SingleInstance_com();
    private static SingleInstance_com getSingleInstance_com02(){
        return singleInstance_com01;
    }



}
