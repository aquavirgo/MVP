package example.tutorial.mvp.ui.ui.main;

import example.tutorial.mvp.ui.ui.base.MvpPresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}