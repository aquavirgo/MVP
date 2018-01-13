package example.tutorial.mvp.ui.ui.login;

import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.ui.ui.base.BasePresenter;

/**
 * Created by Jakub on 2018-01-13.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}