package ru.netology.javaqa.Man;

import ru.netology.javaqa.Dom.Films;

public class Main {
    public static void main(String[] args) {

        Films film1 = new Films(1, "Бладшот", "боевик", "с 5 марта");
        Films film2 = new Films(2, "Вперёд", "мультфильм", "с 12 марта");
        Films film3 = new Films(3, "Отель 'Белград'", "комедия", "с 5 марта");
        Films film4 = new Films(4, "Джентельмены", "боевик", "с 13 февраля");
        Films film5 = new Films(5, "Человек-невидимка", "ужасы", "с 5 марта");
        Films film6 = new Films(6, "Тролли. Мировой тур", "мультфильм", "с 19 марта");
        Films film7 = new Films(7, "Номер один", "комедия", "с 19 марта");

        FilmsManager manager = new FilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Films[] all = manager.findLast();
    }


}