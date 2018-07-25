package projects.n2t.myapplication.ZUtils.Network.API;

import projects.n2t.myapplication.Models.HomeResponseModel.Response;
import retrofit.http.GET;
import retrofit2.Call;

public interface ReqAPI {
    @GET("bins/1e9eyu")
    Call<Response> call();
}
