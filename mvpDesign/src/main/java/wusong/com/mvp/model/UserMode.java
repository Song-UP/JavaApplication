package wusong.com.mvp.model;

/**
 * Created by SongUp on 2018/5/20.
 */

public class UserMode implements IUser {
    private String user, password;

    public UserMode(String user, String password) {
        this.user = user;
        this.password = password;
    }


    @Override
    public void getName() {

    }

    @Override
    public void getPassword() {

    }

    @Override
    public boolean checkUserPassword(String user, String password) {

        if (user != null && password != null){
            if (this.user.equals(user) && this.password.equals(password))
                return true;
        }
        return false;

    }

    public static UserMode getInstance(){
        return  new UserMode("user","123456");
    }

}
