package com.example.nurafiqah_lab4;

public class Artist {

    String artistId;
    String artistName;

    public Artist () {}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}
