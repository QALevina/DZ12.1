package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();
    private String movie1;
    private String movie2;
    private String movie3;


    @Test
    public void addMovie() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.getMovies();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);


        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast(5);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNoLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLastNoLimit();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLastLessLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2};
        String[] actual = manager.findLast(2);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastOverLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast(5);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastLimit() {
        PosterManager manager = new PosterManager(6);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLastNoLimit();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findEqualsLimit() {
        PosterManager manager = new PosterManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLastNoLimit();

        Assertions.assertArrayEquals(expected, actual);

    }

}








