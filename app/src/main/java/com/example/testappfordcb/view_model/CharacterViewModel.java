package com.example.testappfordcb.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.testappfordcb.repository.CharacterRepository;
import com.example.testappfordcb.response.CharacterResponse;

public class CharacterViewModel extends AndroidViewModel {
   private CharacterRepository characterRepository;
   private LiveData<CharacterResponse>characterResponseLiveData;

    public CharacterViewModel(@NonNull Application application) {
        super(application);
        characterRepository = new CharacterRepository() ;
        this.characterResponseLiveData = characterRepository.getCharacters();
    }
    public LiveData<CharacterResponse>getCharacterResponseLiveData(){

        return characterResponseLiveData;
    }
}
