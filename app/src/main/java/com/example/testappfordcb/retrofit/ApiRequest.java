package com.example.testappfordcb.retrofit;



import com.example.testappfordcb.model.CharacterList;
import com.example.testappfordcb.repository.CharacterRepository;
import com.example.testappfordcb.response.CharacterResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    @GET("character")
    Call<CharacterResponse> getAllCharacters();
}
