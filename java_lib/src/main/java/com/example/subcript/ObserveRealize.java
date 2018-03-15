package com.example.subcript;

/**
 * Created by SongUp on 2018/3/14.
 */
//è§?å¯????½è±¡?¹æ?
interface Observe{
    void upData(String message);
}

//è§?å¯???å®???
public class ObserveRealize implements Observe{
    private String name;

    public ObserveRealize(String name) {
        this.name = name;
    }

    @Override
    public void upData(String message) {
//        ?¶å?°æ?´æ?°ä¿¡??ï¼?
        System.out.println(name+"ÊÕµ½µÄÐÅÏ¢ÊÇ£º"+message);
    }
}
