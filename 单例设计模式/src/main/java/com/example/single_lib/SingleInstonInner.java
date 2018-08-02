package com.example.single_lib;

/**
 * 普通单例设计模式
 */
public class SingleInstonInner {
    private SingleInstonInner(){
    }

    class SingleHolder{
        private static SingleInstonInner INSTANCE = new SingleInstonInner();
    }

    public SingleInstonInner getInstance(){
        return SingleHolder.INSTANCE;
    }


}
