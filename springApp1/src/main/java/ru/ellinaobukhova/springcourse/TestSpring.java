package ru.ellinaobukhova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("classicalMusicBean", Music.class);

        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println("Player " + player.getName() + ", volume: " + player.getVolume());
        player.playMusic();

        context.close();
    }
}
