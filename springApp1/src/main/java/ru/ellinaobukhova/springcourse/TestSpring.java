package ru.ellinaobukhova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("classicalMusicBean", Music.class);

        MusicPlayer player1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println("Player " + player1.getName() + ", volume: " + player1.getVolume());
        player1.playMusic();

        MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        boolean res = player1 == player2;
        System.out.println("Equal by link: " + res);
        
        System.out.println("Player " + player1.getName() + ", volume: " + player1.getVolume());
        player1.playMusic();

        context.close();
    }
}
