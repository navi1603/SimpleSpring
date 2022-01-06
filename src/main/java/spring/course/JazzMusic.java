package spring.course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Jazz";

    }
}
