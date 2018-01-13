package example.tutorial.mvp.ui.ui.splash;

import example.tutorial.mvp.ui.ui.base.MvpView;

/**
 * Created by Jakub on 2018-01-13.
 */
//launcher activity
public interface SplashMvpView extends MvpView {
    void openMainActivity();

    void openLoginActivity();
}
