package Lessons; //Ключевое слово Final

/**
 * Используется для обозначения неизменяемой переменной (константа)
 * Все константы пишутся заглавными буквами
 * Сеттеры для констант не создаются
 */

public class Lesson22 {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
    }
}

class Test {
    public static final int CONSTANT = 0;
}
