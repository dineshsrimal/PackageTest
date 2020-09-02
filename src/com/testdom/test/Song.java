package com.testdom.test;

import java.util.*;

/**
 * Created by dineshs on 6/5/2019.
 */
public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {

        if (this.nextSong == null) {
            return false;
        }

        boolean isPlayList = false;
        Set<String> playlistSongs = new HashSet<String>();
        playlistSongs.add(this.name);
        Song current = this;

        while(true) {

            if(current == null) {
                break;
            }else if(!playlistSongs.add(current.nextSong.name)) {
                isPlayList = true;
                break;
            }

            current = current.nextSong;

        }

        return isPlayList;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
