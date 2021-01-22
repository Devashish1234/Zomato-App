package Utils;

import com.example.zomatoapp.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ZomatoApi {

    @Headers("user-key:"+Credentials.API_KEY)
    @GET("/api/v2.1/categories")
    Call<Data> getCategory();
}
