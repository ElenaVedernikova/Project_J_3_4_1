package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    Movie first = new Movie(1, 1, "first", "horrors");
    Movie second = new Movie(2, 2, "second", "drama");
    Movie third = new Movie(3, 3, "third", "comedy");
    Movie fourth = new Movie(4, 4, "fourth", "horrors");
    Movie fifth = new Movie(5, 5, "fifth", "drama");
    Movie sixth = new Movie(6, 6, "sixth", "comedy");
    Movie seventh = new Movie(7, 7, "seventh", "horrors");
    Movie eighth = new Movie(8, 8, "eighth", "drama");
    Movie ninth = new Movie(9, 9, "ninth", "comedy");
    Movie tenth = new Movie(10, 10, "tenth", "drama");
    Movie eleventh = new Movie(11, 11, "eleventh", "drama");

    @Test
    public void shouldShowPosterDefaultMax() {
        PosterManager poster = new PosterManager();

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowPosterDefaultAfterMax() {
        PosterManager poster = new PosterManager();

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);
        poster.add(eleventh);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterDefaultMin() {
        PosterManager poster = new PosterManager();

        poster.add(first);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowPosterSetCountMax() {
        PosterManager poster = new PosterManager(11);

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);
        poster.add(eleventh);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowPosterSetCountAfterMax() {
        PosterManager poster = new PosterManager(10);

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);
        poster.add(eleventh);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowPosterSetCountMin() {
        PosterManager poster = new PosterManager(1);

        poster.add(tenth);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{tenth};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowPosterSetCountBeforeMax() {
        PosterManager poster = new PosterManager(6);

        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);

        Movie[] actual = poster.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }
}
