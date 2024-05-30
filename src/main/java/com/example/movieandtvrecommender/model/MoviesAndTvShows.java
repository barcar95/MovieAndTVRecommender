package com.example.movieandtvrecommender.model;

import java.util.List;

public class MoviesAndTvShows {
    private String id;
    private String title;
    private String type;  // Movie or show
    private List<String> genres;

    // get/set methods
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public List<String> getGenres(){
        return genres;
    }

    public void setGenres(List<String> genres){
        this.genres = genres;
    }
}
