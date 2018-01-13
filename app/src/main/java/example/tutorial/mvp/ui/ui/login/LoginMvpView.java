package example.tutorial.mvp.ui.ui.login;

import example.tutorial.mvp.ui.ui.base.MvpView;

/**
 * Created by Jakub on 2018-01-13.
 */

public interface LoginMvpView extends MvpView {

    void openMainActivity();

    void onLoginButtonClick();

}