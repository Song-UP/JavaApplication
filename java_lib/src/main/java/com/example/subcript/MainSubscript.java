package com.example.subcript;

/**
 * Created by SongUp on 2018/3/14.
 */

public class MainSubscript {
    public static void main(String arg[]){
        //�۲���
        ObserveRealize observeRealize01 = new ObserveRealize("�۲���һ");
        ObserveRealize observeRealize02 = new ObserveRealize("�۲��߶�");
        ObserveRealize observeRealize03 = new ObserveRealize("�۲�����");
        ObserveRealize observeRealize04 = new ObserveRealize("�۲�����");

        //���۲���
        SubscriptRealize subscriptRealize = new SubscriptRealize();
        subscriptRealize.attach(observeRealize01);
        subscriptRealize.attach(observeRealize02);
        subscriptRealize.attach(observeRealize03);
        subscriptRealize.attach(observeRealize04);
//֪ͨ����
        subscriptRealize.notifyObsever("�ø�����");
    }
}
