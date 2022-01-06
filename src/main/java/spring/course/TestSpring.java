package spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main (String [] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

 //       Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        System.out.println(musicPlayer.playMusic());
//        musicPlayer.playMusic(Style.JAZZ);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());


        context.close();

    }
}
