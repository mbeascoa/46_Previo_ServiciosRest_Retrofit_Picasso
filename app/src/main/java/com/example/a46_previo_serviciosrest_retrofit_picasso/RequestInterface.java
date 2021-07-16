package com.example.a46_previo_serviciosrest_retrofit_picasso;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("cars_list.json") Call<List<CarsModel>> getCarJson();
}