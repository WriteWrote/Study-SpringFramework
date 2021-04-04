package ru.ellinaobukhova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicalMusicBean", Music.class);
        System.out.println(music.getSong());
        
        context.close();
    }
}
