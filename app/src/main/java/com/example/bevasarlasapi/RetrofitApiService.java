package com.example.bevasarlasapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    // GET all users
    @GET("acttFJ/shopping")
    Call<List<ShopList>> getAllShopping();

    // GET user by ID
    @GET("acttFJ/shopping/{id}")
    Call<ShopList> getShoppingById(@Path("id") int id);

    // POST (create a new user)
    @POST("acttFJ/shopping")
    Call<ShopList> createShopping(@Body ShopList people);

    // PUT (update a user)
    @PUT("acttFJ/shopping/{id}")
    Call<ShopList> updateShopping(@Path("id") int id, @Body ShopList people);

    // DELETE (delete a user by ID)
    @DELETE("acttFJ/shopping/{id}")
    Call<Void> deleteShopping(@Path("id") int id);
}