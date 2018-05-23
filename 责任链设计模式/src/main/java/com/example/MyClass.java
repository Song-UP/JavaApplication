package com.example;

import com.example.handles.ConcreHandles1;
import com.example.handles.ConcreHandles2;
import com.example.handles.ConcreHandles3;
import com.example.handles.ConcreHandles4;
import com.example.responchain.Handle;
import com.example.responchain.Level;
import com.example.responchain.Request;

public class MyClass {
    public static void main(String[] args){
        Handle concreHandles1 = new ConcreHandles1();
        Handle concreHandles2 = new ConcreHandles2();
        Handle concreHandles3 = new ConcreHandles3();
        Handle concreHandles4 = new ConcreHandles4();

        concreHandles1.setNextHandle(concreHandles2);
        concreHandles2.setNextHandle(concreHandles3);
        concreHandles3.setNextHandle(concreHandles4);

        Request request1 = new Request(new Level(0));
        concreHandles1.handleResponse(request1);

        Request request2 = new Request(new Level(5));
        concreHandles1.handleResponse(request2);


    }
}
