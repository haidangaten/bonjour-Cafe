package com.example.msi.bonjourcafe.Retrofit;

public class APIUtils {
    public static final String BASE_URL="http://bonjour.greensoft.vn:80/api/OrderOnline/";
    public static FoodAPI getFoodAPI(){
        return RetrofitClient.getClient(BASE_URL).create(FoodAPI.class);
    }
}
