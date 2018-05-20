package wusong.com.mvp.presenter;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;

import wusong.com.mvp.model.IUser;
import wusong.com.mvp.model.UserMode;
import wusong.com.mvp.view_iple.IView;

/**
 * Created by SongUp on 2018/5/20.
 */

public class LoginPresenter implements IPresenter {
    IView iView;
    IUser iUser;
    Handler handler;

    public LoginPresenter(IView iView) {
        this.iView = iView;
        this.iUser = UserMode.getInstance();
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void clear() {
        iView.clear();

    }

    @Override
    public void doLogin(String name, String password) {
        final boolean isSuccess = iUser.checkUserPassword(name, password);
        showProgress(true);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showProgress(false);
                iView.doLogin(isSuccess);
            }
        },3000);
    }

    @Override
    public void showProgress(boolean isShowPro) {
        iView.showProgress(isShowPro);
    }
}
