package example.tutorial.mvp;

import android.app.Application;

import example.tutorial.mvp.model.DataManager;
import example.tutorial.mvp.model.SharedPrefsHelper;

/**
 * Created by Jakub on 2018-01-13.
 */

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}