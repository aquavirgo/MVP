package example.tutorial.mvp.ui.ui.main;

import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.ui.ui.base.BasePresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public class MainPresenter <V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}