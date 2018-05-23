package com.example.responchain;

/**
 * Created by SongUp on 2018/5/23.
 */

public class Response {
    String name;
    public Response(String name){
        this.name = name;
        System.out.println("\t"+"处理完事件了");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
