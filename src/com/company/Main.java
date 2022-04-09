package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static MovieStore s = new MovieStore();
    private static FindByMap f =  new FindByMap();
    private static Scanner in = new Scanner(System.in);
    private static Scanner line = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        commands();
        int num = in.nextInt();
        if (num == 1) {
            for (Movies m : movies) {
                System.out.println(m);
            }
        } else if (num == 2) {
            System.out.println("Поиск: ");
            String title = line.nextLine();
            s.findMovie(movies,title);
        } else if (num == 3) {
            System.out.println("Годы выпуска фильмов: ");
            s.sortByYear(movies);

        }
        else if (num == 4) {
            System.out.println("Название фильмов: ");
            s.sortByName(movies);

        }
        else if (num == 5) {
            System.out.println("Режиссеры: ");
            s.sortByDirector(movies);

        }
    }


    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
