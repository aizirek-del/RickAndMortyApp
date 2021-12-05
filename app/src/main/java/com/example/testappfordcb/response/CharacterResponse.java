package com.example.testappfordcb.response;

import com.example.testappfordcb.model.Characters;
import com.example.testappfordcb.model.Info;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CharacterResponse {

    public List<Characters> characters;
    public Info info;

    public List<Characters> getCharacter() {
        return characters;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void setCharacter(List<Characters> characters) {
        this.characters = characters;
    }

//   @Override
//   public String toString() {
//      return "Characters{" +
//                "character=" + characters +
//                '}';
//    }
}
