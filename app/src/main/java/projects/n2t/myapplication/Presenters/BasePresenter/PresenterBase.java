package projects.n2t.myapplication.Presenters.BasePresenter;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import projects.n2t.myapplication.Presenters.HomePresenter.IPresenterHome;
import projects.n2t.myapplication.ZUtils.Contant.Url;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PresenterBase implements IBasePresenter {
    private OkHttpClient createDefaultOkHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient().newBuilder()
                .addInterceptor(interceptor)
                .build();
    }

    @Override
    public Retrofit createRetrofit(String url) {
        return new Retrofit.Builder()
                .baseUrl(Url.url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(createDefaultOkHttpClient())
                .build();
    }
}
