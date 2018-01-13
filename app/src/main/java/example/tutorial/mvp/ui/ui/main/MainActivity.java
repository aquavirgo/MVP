package example.tutorial.mvp.ui.ui.main;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import example.tutorial.mvp.MvpApp;
import example.tutorial.mvp.R;
import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.ui.ui.splash.SplashActivity;
import example.tutorial.mvp.ui.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    TextView textViewShow;
    Button buttonLogout;
    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        textViewShow = (TextView) findViewById(R.id.textViewShow);

        buttonLogout = (Button) findViewById(R.id.buttonLogout);

        textViewShow.setText(mainPresenter.getEmailId());


        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });

    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}