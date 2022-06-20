package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private int count;

    public Playlist() {}

    public String getPlaylistName() {
        return playlistName;
    }

    public void print() {
        System.out.println("Jumlah Lagu = " + this.songs.size() + " / Kapasitas Playlist = 6");
        int x = 0;
        for (Song song : this.songs){
            System.out.println("ListSong[" + x + "] :" + song.getName() + " - " + song.getArtist());
            x++;
        }
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String totalTime(){
        for (Song song : songs){
            this.count += song.getLength();
        } return "\nTotal waktu [" + getPlaylistName()+ "] = " + count  + " detik";
    }

    public void add(Song song) {
        if (songs.size() < 6){
            songs.add(song);
        } else {
            System.out.println("Playlist " + this.playlistName + " penuh!. Tidak bisa menambahkan lagu lagi.");
        }
    }

    public void remove (String songName){
        for (Song song : songs){
            if (song.getName().equals(songName)){
                songs.remove(song);
                System.out.println(song.getName() + " terhapus...");
                break;
            }
        }
    }

    public int size(){
        return this.songs.size();
    }
}
