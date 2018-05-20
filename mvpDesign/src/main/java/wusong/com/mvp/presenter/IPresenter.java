package wusong.com.mvp.presenter;

/**
 * Created by SongUp on 2018/5/20.
 */

public interface IPresenter {
    void clear();
    void doLogin(String name, String password);
    void showProgress(boolean isShowPro);

}
