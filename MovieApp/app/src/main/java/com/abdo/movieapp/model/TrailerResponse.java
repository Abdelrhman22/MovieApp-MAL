package com.abdo.movieapp.model;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Created by Abdo on 17/01/2018.
 */

public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getIdTrailer(){
        return id_trailer;
    }

    public void seIdTrailer(int id_trailer){
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults(){
        return results;
    }
}
