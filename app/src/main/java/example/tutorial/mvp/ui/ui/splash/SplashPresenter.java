package example.tutorial.mvp.ui.ui.splash;

import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.ui.ui.base.BasePresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}