package projects.n2t.myapplication.Views.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import projects.n2t.myapplication.Models.HomeResponseModel.Response;
import projects.n2t.myapplication.R;

public class MainActivity extends AppCompatActivity implements ViewHome{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void success(Response response) {
        Log.d("data",response.getTaskList().toString());
    }

    @Override
    public void fail() {

    }
}
