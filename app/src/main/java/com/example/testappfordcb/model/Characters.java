package com.example.testappfordcb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Characters {

    @SerializedName("created")
    @Expose
   public String created;
    @SerializedName("gender")
    @Expose
   public String gender;


  public   int id;
    @SerializedName("image")
    @Expose
   public String image;
    @SerializedName("name")
    @Expose
   public String name;
    @SerializedName("species")
    @Expose
   public String species;
    @SerializedName("status")
    @Expose
   public String status;
    @SerializedName("type")
    @Expose
   public String type;
    @SerializedName("url")
    @Expose
   public String url;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "created='" + created + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
