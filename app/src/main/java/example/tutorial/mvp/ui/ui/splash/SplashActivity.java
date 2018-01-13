package example.tutorial.mvp.ui.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import example.tutorial.mvp.ui.ui.login.LoginActivity;
import example.tutorial.mvp.ui.ui.main.MainActivity;
import example.tutorial.mvp.MvpApp;
import example.tutorial.mvp.R;
import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.ui.ui.base.BaseActivity;

/**
 * Created by Jakub on 2018-01-13.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

}
