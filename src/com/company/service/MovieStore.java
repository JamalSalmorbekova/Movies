package com.company.service;

import com.company.interfaces.SortAble;
import com.company.models.Director;
import com.company.models.Movies;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore implements SortAble {

    @Override
    public void printAllMovies(List<Movies> movies) {
        movies.stream().map(Movies::getName);
    }




    @Override
    public void findMovie(List<Movies> movies,String title) {
          movies.stream().map(Movies::getName).filter(name->name.contains(title)).forEach(System.out::println);


    }

    @Override
    public void sortByYear(List<Movies> movies) {
       movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach(System.out::println);


    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.stream().map(Movies::getName).sorted().forEach(System.out::println);
        //movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);

    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Map<Director, List<Movies>> classificationListMap = movies.stream().collect(Collectors.groupingBy(Movies::getDirector));
        List <Director> directors = new ArrayList<>();
        directors.addAll(classificationListMap.keySet());
        directors.stream().sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);

    }
}
