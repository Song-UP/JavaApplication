package com.example.handles;

import com.example.responchain.Handle;
import com.example.responchain.Level;
import com.example.responchain.Request;
import com.example.responchain.Response;

/**
 * Created by SongUp on 2018/5/23.
 */

public class ConcreHandles4 extends Handle{
    @Override
    public Level getHandleLevel() {
        return new Level(4);
    }
    @Override
    public Response response(Request request) {
        System.out.print("该请求已 4 被相应");
        return new Response("相应结果 4");
    }
}
