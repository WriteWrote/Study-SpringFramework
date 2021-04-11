package ru.ellinaobukhova.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
        musicList = new ArrayList<>();
    }

    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    public void setMusicList(List<Music> music) {
        this.musicList = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        for (Music typeOfMusic :
                musicList) {
            System.out.println("Playing " + typeOfMusic.getSong() + " now!");
        }
    }

    private void init() {
        System.out.println("Initialising music player");
    }

    private void destroy() {
        System.out.println("Destroying music player");
    }
}
