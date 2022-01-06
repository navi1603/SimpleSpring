package spring.course;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {





    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public List<Music> genre(){

        return Arrays.asList(classicMusic(), jazzMusic(), rockMusic());
    }


    @Bean
    public MusicPlayer musicPlayer (){
        return new MusicPlayer(genre());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
