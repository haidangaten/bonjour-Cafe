package com.example.msi.bonjourcafe.Retrofit;


import com.example.msi.bonjourcafe.Model.Food;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodAPI {
    @GET("GetHangHoas?tenantId=85854b97-6849-45e2-b8a9-807652cdbe0f")
    Call<List<Food>> getFood();




}
