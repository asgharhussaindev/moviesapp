package com.duniyatv.duniyamovies;

/**
 * Created by ashgarhussain on 7/30/17.
 *
 * This class represents the movie DAO/Model
 */

public class Movie {
    private String releaseDate;
    private String posterPath;
    private String plotSynopsis;
    private double rating;
    private String title;

    public Movie(){}

    public Movie(String releaseDate, String posterPath, String plotSynopsis, double rating,
                 String title){
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.plotSynopsis = plotSynopsis;
        this.rating = rating;
        this.title = title;
    }

    public Movie(String posterPath){
        this.posterPath = posterPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getPlotSynopsis() {
        return plotSynopsis;
    }

    public void setPlotSynopsis(String plotSynopsis) {
        this.plotSynopsis = plotSynopsis;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReleaseDate() {
      return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int describeContents(){
        return this.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}