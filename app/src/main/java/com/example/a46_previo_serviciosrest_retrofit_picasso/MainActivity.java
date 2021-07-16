package com.example.a46_previo_serviciosrest_retrofit_picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ArrayList<CarsModel> carsModels = new ArrayList<>();
    private CarsAdapter carsAdapter;
    private RecyclerView cars_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cars_recyclerview = findViewById(R.id.car_recyclerview);
        cars_recyclerview.setLayoutManager(new LinearLayoutManager(context:this));
        getCarResponse();
    }
    private void getCarResponse() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://navneet7k.github.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterfacerequestInterface = retrofit.create(RequestInterface.class);
        Call<List<CarsModel>> call = requestInterface.getCarJson();
        call.enqueue(new Callback<List<CarsModel>>() {
            @Override public void onResponse(Call<List<CarsModel>> call, Response<List<CarsModel>> response) {
                carsModels= new ArrayList<>(response.body());
                carsAdapter= new CarsAdapter(MainActivity.this,carsModels);
                car_recyclerview.setAdapter(carsAdapter);
                Toast.makeText(MainActivity.this, "ConexiónExitosa", Toast.LENGTH_SHORT).show();
            }
            @Override public void onFailure(Call<List<CarsModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Conexión No Exitosa", Toast.LENGTH_SHORT).show();
            }
        });
    }
}