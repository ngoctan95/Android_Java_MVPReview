package projects.n2t.myapplication.Views.Home;

import projects.n2t.myapplication.Models.HomeResponseModel.Response;

public interface ViewHome {
    void success(Response response);
    void fail();
}
