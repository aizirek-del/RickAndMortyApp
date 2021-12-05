package com.example.testappfordcb.retrofit;



import com.example.testappfordcb.response.CharacterResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("character/?page=2")
    Call<CharacterResponse> getAllCharacters();
}
