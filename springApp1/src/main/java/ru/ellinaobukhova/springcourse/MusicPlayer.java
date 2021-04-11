package ru.ellinaobukhova.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    private MusicPlayer() {
        musicList = new ArrayList<>();
    }

    private static MusicPlayer musicPlayerFactory() {
        MusicPlayer res = new MusicPlayer();
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music() {
            @Override
            public String getSong() {
                return "Lindsey Stirling Violin Song";
            }
        });
        res.setMusicList(musicList);
        return res;
    }

    private MusicPlayer(List<Music> music) {
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
