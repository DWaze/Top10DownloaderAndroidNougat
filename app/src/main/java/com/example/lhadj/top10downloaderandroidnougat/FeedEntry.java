package com.example.lhadj.top10downloaderandroidnougat;

/**
 * Created by lhadj on 7/15/2017.
 */

public class FeedEntry {

    private String Name ;
    private String Artist;
    private String releaseDate ;
    private String summary;
    private String imageURL;

    public void setName(String name) {
        Name = name;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return Name;
    }

    public String getArtist() {
        return Artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    @Override
    public String toString() {
        return "name=" + Name + '\n' +
                ", artist=" + Artist + '\n' +
                ", releaseDate=" + releaseDate + '\n' +
                ", imageURL=" + imageURL + '\n';
    }
}
