package com.example.movieandtvrecommender.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private List<String> viewerHistory;  // List of Movie/shows ids User watched
    private List<String> preferredGenres;  // List of preferred Genres

    // Getters and setters
    public Long getID(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<String> getViewerHistory(){
        return viewerHistory;
    }

    public void setViewerHistory(List<String> viewerHistory){
        this.viewerHistory = viewerHistory;
    }

    public List<String> getPreferredGenres(){
        return preferredGenres;
    }

    public void setPreferredGenres(List<String> preferredGenres){
        this.preferredGenres = preferredGenres;
    }
}
