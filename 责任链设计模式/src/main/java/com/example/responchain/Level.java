package com.example.responchain;

/**
 * Created by SongUp on 2018/5/23.
 */

public class Level {
    private int levelNum;

    public Level(int levelNum) {
        this.levelNum = levelNum;
    }
    public boolean above(Level level){
        if (level.levelNum <= levelNum)
            return true;
        return false;
    }

    public int getLevelNum() {
        return levelNum;
    }
}
