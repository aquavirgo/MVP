package example.tutorial.mvp.ui.ui.login;

import example.tutorial.mvp.ui.ui.base.MvpPresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}