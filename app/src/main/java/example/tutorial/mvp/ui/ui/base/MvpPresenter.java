package example.tutorial.mvp.ui.ui.base;

/**
 * Created by Jakub on 2018-01-13.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}
