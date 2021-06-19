package ru.netology.manager;

import ru.netology.domain.Movie;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class PosterManager {
    private Movie[] movie = new Movie[0];
    private int countMovie = 10;

    public PosterManager(int countMovie) {

        this.countMovie = countMovie;
    }

    public void add(Movie mov) {

        int length = movie.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movie, 0, tmp, 0, movie.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = mov;
        movie = tmp;
    }

    public Movie[] getAll() {

        int resultLength;
        if (movie.length < countMovie) {
            resultLength = movie.length;
        } else {
            resultLength = countMovie;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movie.length - i - 1;
            result[i] = movie[index];
        }
        return result;
    }


}