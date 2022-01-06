package spring.course;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;


public class ClassicMusic implements Music {


    @Override
    public String getSong() {

        return "Classic";
    }
}
