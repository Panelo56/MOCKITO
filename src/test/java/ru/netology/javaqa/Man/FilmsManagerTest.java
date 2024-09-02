package ru.netology.javaqa.Man;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Dom.Films;

public class FilmsManagerTest {

    Films film1 = new Films(1, "Бладшот", "боевик", "с 5 марта");
    Films film2 = new Films(2, "Вперёд", "мультфильм", "с 12 марта");
    Films film3 = new Films(3, "Отель 'Белград'", "комедия", "с 5 марта");
    Films film4 = new Films(4, "Джентельмены", "боевик", "с 13 февраля");
    Films film5 = new Films(5, "Человек-невидимка", "ужасы", "с 5 марта");
    Films film6 = new Films(6, "Тролли. Мировой тур", "мультфильм", "с 19 марта");
    Films film7 = new Films(7, "Номер один", "комедия", "с 19 марта");

    @Test
    public void testFindLast () {
        FilmsManager manager = new FilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        Films[] expected = {film6, film5, film4, film3, film2};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);


        Films[] expected = {film1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);


        Films[] expected = {film4, film3, film2, film1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4FindLast () {
        FilmsManager manager = new FilmsManager(7);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5FindLast() {
        FilmsManager manager = new FilmsManager();


        Films[] expected = {};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6FindLast () {
        FilmsManager manager = new FilmsManager(4);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Films[] expected = {film7, film6, film5, film4};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Films[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Films[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}