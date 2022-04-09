package com.company;

import java.util.List;

public class FindByMap implements FindAble{

    @Override
    public void findMoviesByActor(List<Movies> movies) {
        movies.stream().map(Movies::getName).filter(name->name.contains(title)).forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies) {

    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {

    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {

    }

    @Override
    public void showActorRoles(List<Movies> movies) {

    }
}
