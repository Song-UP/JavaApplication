package wusong.com.mvp.model;

/**
 * Created by SongUp on 2018/5/20.
 */

public interface IUser {

    void getName();
    void getPassword();

    boolean checkUserPassword(String user, String password);

}
