package com.example.handles;

import com.example.responchain.Handle;
import com.example.responchain.Request;
import com.example.responchain.Response;
import com.example.responchain.Level;

/**
 * Created by SongUp on 2018/5/23.
 */

public class ConcreHandles3 extends Handle{
    @Override
    public Level getHandleLevel() {
        return new Level(3);
    }
    @Override
    public Response response(Request request) {
        System.out.print("该请求已 3 被相应");
        return new Response("相应结果 3");
    }
}
