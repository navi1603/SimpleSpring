package spring.course;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;



    private List<Music> genre ;

        public MusicPlayer(List<Music> genre) {
            this.genre = genre;

        }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
//            //int a = (int) (Math.random() * 3);
//            Random rd = new Random();
//            int a = rd.nextInt(3);
//
//            switch (style) {
//                case CLASSICAL:
//                    System.out.println("Plying music: " + a + ". "+ music2.getSong().get(a));
//                    break;
//
//                case JAZZ:
//                    System.out.println("Plying music: " + a + ". "+ music1.getSong().get(a));
//                    break;
            Random rd = new Random();
            return "Playing: " + genre.get(rd.nextInt(genre.size())).getSong() + " with volume " + this.volume;



            }
        }



