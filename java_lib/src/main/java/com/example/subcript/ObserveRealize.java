package com.example.subcript;

/**
 * Created by SongUp on 2018/3/14.
 */
//�۲���
interface Observe{
    void upData(String message);
}

//�۲���ʵ����
public class ObserveRealize implements Observe{
    private String name;

    public ObserveRealize(String name) {
        this.name = name;
    }

    @Override
    public void upData(String message) {
//        �յ�������Ϣ
        System.out.println(name+"�յ�����Ϣ�ǣ�"+message);
    }
}
