package com.example.responchain;

/**
 * Created by SongUp on 2018/5/23.
 */

public abstract class Handle {
    private Handle nextHandle;

    public void setNextHandle(Handle nextHandle){
        this.nextHandle = nextHandle;
    }

    public final Response handleResponse(Request request){
        Response response = null;
        if (this.getHandleLevel().above(request.getLevel())){
            response(request);
        }else {
            if (nextHandle == null) {
                System.out.println("没有找到合适的");
            } else {
                response = this.nextHandle.handleResponse(request);
            }
        }
        return response;

    }

    public abstract Level getHandleLevel();
    public abstract Response response(Request request);


}
