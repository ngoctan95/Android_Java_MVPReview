package projects.n2t.myapplication.Presenters.HomePresenter;

import android.content.Context;

import projects.n2t.myapplication.Models.HomeResponseModel.Response;
import projects.n2t.myapplication.Presenters.BasePresenter.PresenterBase;
import projects.n2t.myapplication.Views.Home.ViewHome;
import projects.n2t.myapplication.ZUtils.Contant.Url;
import projects.n2t.myapplication.ZUtils.Network.API.ReqAPI;
import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class HomePresenter implements IPresenterHome {
    private ViewHome viewHome;
    private Context context;
    private PresenterBase presenterBase;

    public HomePresenter(ViewHome viewHome, Context context) {
        this.viewHome = viewHome;
        this.context = context;
    }

    @Override
    public void sendRequest() {
        Retrofit retrofit = presenterBase.createRetrofit(Url.url);
        if (retrofit != null) {
            ReqAPI reqAPI = retrofit.create(ReqAPI.class);
            Call<Response> call = reqAPI.call();
            call.enqueue(new Callback<Response>() {
                @Override
                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                    if (response.isSuccessful()) {
                        viewHome.success(response.body());
                    } else {
                        viewHome.fail();
                    }
                }

                @Override
                public void onFailure(Call<Response> call, Throwable t) {
                    viewHome.fail();
                }
            });
        }
    }
}
