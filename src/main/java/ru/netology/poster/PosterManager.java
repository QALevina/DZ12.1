package ru.netology.poster;

public class PosterManager {
    private String[] movies = new String[0];
    private int limit = 10;

    private int idMovie;
    private String nameMovie;


    public PosterManager() {

    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    //Добавление нового фильма.

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] getMovies() {
        return movies;
    }

    //Вывод всех фильмов в порядке добавления (findAll)

    public String[] findAll() {
        String[] tmp = new String[movies.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        tmp = movies;
        return movies;


    }

    //Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядке (findLast)

    public String[] findLast(int limit) {
        int resultLenght;

        if (limit <= movies.length) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }

    public String[] findLastNoLimit() {
        int resultLenght;
        if (limit == movies.length) {
            resultLenght = limit;
        }
        if (limit <= movies.length) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }
}


