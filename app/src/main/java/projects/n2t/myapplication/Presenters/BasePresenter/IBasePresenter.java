package projects.n2t.myapplication.Presenters.BasePresenter;

import retrofit2.Retrofit;

public interface IBasePresenter {
    Retrofit createRetrofit(String url);
}
