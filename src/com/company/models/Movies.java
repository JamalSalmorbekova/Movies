package com.company.models;

import com.company.models.Cast;
import com.company.models.Director;

import java.util.List;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    void printCast() {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~***~~~~~~~~~~~~~~~~~~\n"
                +"Название фильма: "+ name + "\n" +
                "Год выпуска: " + year +"\n"+
                "Описание: " + description + "\n" +
                "Режиссер: " + director +"\n"+
                "В ролях: " + cast+"\n";
    }
}
