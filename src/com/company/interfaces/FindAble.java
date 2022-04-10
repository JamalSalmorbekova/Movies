package com.company.interfaces;

import com.company.models.Movies;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies, String actorName);

    void findMoviesByDirector(List<Movies> movies,String directorName);

    void findMoviesByYear(List<Movies> movies, int year);

    void findMoviesAndRoleByActor(List<Movies> movies,String title);

    void showActorRoles(List<Movies> casts);
}
