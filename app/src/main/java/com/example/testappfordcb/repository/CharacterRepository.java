package com.example.testappfordcb.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.testappfordcb.response.CharacterResponse;
import com.example.testappfordcb.retrofit.ApiRequest;
import com.example.testappfordcb.retrofit.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CharacterRepository {
    private static final String TAG =CharacterRepository.class.getSimpleName();
    private final ApiRequest apiRequest;

   public CharacterRepository(){
       apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
   }
   public  LiveData<CharacterResponse> getCharacters(){

     final MutableLiveData<CharacterResponse>  data = new MutableLiveData<>();
       apiRequest.getAllCharacters()
               .enqueue(new Callback<CharacterResponse>() {
                   @Override
                   public void onResponse(Call<CharacterResponse> call, Response<CharacterResponse> response) {

                       if(response.body()!= null){
                           data.setValue(response.body());
                       }
                   }

                   @Override
                   public void onFailure(Call<CharacterResponse> call, Throwable t) {

                       data.setValue(null);
                   }
               });
       return data;
   }


}
