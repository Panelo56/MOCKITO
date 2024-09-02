package ru.netology.javaqa.Man;

import ru.netology.javaqa.Dom.Films;

public class FilmsManager {

    private Films[] film = new Films[0];
    private int limit;

    public FilmsManager() {
        limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }


    public void add(Films item) {
        Films[] tmp = new Films[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = item;
        film = tmp;

    }

    public Films[] findAll() {
        return film;
    }

    public Films[] findLast() {
        Films[] film = findAll();
        Films[] result;
        if (limit < film.length) {
            result = new Films[limit];
        } else {
            result = new Films[film.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = film[film.length - 1 - i];
        }
        return result;
    }

}