package ru.ellinaobukhova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        player1.setVolume(100);
        System.out.println("Player " + player1.getName() + ", volume: " + player1.getVolume());
        player1.playMusic();

        MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        boolean res = player1 == player2;
        System.out.println("Equal by link: " + res);

        System.out.println("Player " + player2.getName() + ", volume: " + player2.getVolume());
        //player2.playMusic();

        context.close();
    }
}
