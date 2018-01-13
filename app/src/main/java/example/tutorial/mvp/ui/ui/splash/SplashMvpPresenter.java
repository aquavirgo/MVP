package example.tutorial.mvp.ui.ui.splash;

import example.tutorial.mvp.ui.ui.base.MvpPresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();
}

