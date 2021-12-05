package com.example.testappfordcb.response;

import com.example.testappfordcb.model.Characters;
import com.example.testappfordcb.model.Info;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CharacterResponse {

    public List<Characters> results;
    public Info info;

    public List<Characters> getResults() {
        return results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void setResults(List<Characters> results) {
        this.results = results;
    }

//   @Override
//   public String toString() {
//      return "Characters{" +
//                "character=" + characters +
//                '}';
//    }
}
