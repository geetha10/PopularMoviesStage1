package com.geetha.popularmoviess1.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Favorite_Movies")
public class FavoriteMoviesEntity {

    @PrimaryKey
    private Integer id;
    private boolean isFavorite;
    private Double popularity;
    private Boolean video;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private String title;
    private Double voteAverage;
    private String overview;
    private String releaseDate;

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }



    /*@SerializedName("genre_ids")
    @Expose
    private List<Integer> genreIds = null;*/
    /*@SerializedName("adult")
    @Expose
    private Boolean adult;*/
    /*@SerializedName("backdrop_path")
    @Expose
    private String backdropPath;*/



}
