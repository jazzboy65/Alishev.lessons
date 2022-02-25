package AdvancedJava.Regexp; //Урок 32. Классы Pattern и Matcher

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс Pattern представляет собой регулярное выражение
 * класс Matcher использует класс Pattern для проведения операций над текстом
 *
 * Популярное использование классов Pattern и Matcher, поиск совпадений в тексте
 * (например поиск электронной почты)
 *
 * Паттерн программирования Factory - мы ограничиваем создание объектов класса с помощью приватного конструктора,
 * и взамен даём статический метод, который после своей работы возвращает новый объект класса.
 *
 * Методы:
 * *.find() - запускается на объекте класса Matcher, ищет объекты по паттерну
 * *.group() - возвращает то, что было найдено в *.find(), может вызываться с аргументами
 *
 * любая строка которая находится в () является группой - Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)")
 * у каждой группы есть свой id, нумерация начинается с единицы и идёт в глубину - пример:
 * (\w)- 1 группа +@(gmail|yandex) - 2 группа \.(com|ru) - 3 группа
 *
 * Пример вызова определённой группы - matcher.group(1) //joe
 *                                                      //bill
 *
 * *.reset() - сбрасывает позицию matcher
 *
 */

public class PatternAndMatcher {
    public static void main(String[] args) {
        String str = " Eleifend non ultricies. Nisi joe@gmail.com et lacinia dapibus lectus molestie venenatis dui faucibus. " +
                "Lorem est. Vestibulum sed venenatis dictum. Mollis bill@yandex.ru nisi in dui vestibulum vel " +
                "lorem amet vitae odio. Ipsum imper";

        Pattern email = Pattern.compile("(\\w+)+@(gmail|yandex)\\.(com|ru)");

        Matcher matcher = email.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
