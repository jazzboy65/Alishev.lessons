package AdvancedJava.collections; //Урок 7. Множества (Set)

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set - это коллекция, которая хранит в себе только уникальные элементы.
 * Для быстрого поиска элемента по коллекции лучше использовать Set, если не требуется сохранять порядок
 * Игнорирует дубликаты (создает только 1 элемент). Реализует метод toString().
 *
 *
 * Методы Set:
 * 1)*.contains() - существует ли объект в коллекции, работает очень быстро в Set благодаря хэшированию
 * 2)*.isEmpty() - проверка на пустоту, возвращает true если Set пустой
 * 3)1.addAll(2) - в Set 1 добавляет все элементы из Set 2.
 * и т.д.
 */

public class SetBegin {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();//Не сохраняет порядка
        Set<String> linkedHashSet = new LinkedHashSet<>();//Сохраняется порядок ввода элементов в HashSet
        Set<String> treeSet = new TreeSet<>();
        //Обьекты сортируются по их естественному порядку (0 - 1 - 2 -3),строки по лексиграфическому порядку

        hashSet.add("Mike");
        hashSet.add("Bob");
        hashSet.add("George");
        hashSet.add("Tom");
        hashSet.add("Katy");
        hashSet.add("Katy");
        hashSet.add("Katy");

//        for(String name: hashSet) {
//            System.out.println(name);
//        }
//
//        System.out.println(hashSet);
//
//
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Tim"));

        //union (объединение множеств)
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);

        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        Set<Integer> union = new HashSet<>(hashSet1); //Можно передавать в качетстве аргумента другое множество.
        union.addAll(hashSet2);
        System.out.println(union);

        //intersection - пересечение
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2); //Из Set удаляются все элементы, присутствующие в Set, указанного в аргументе
        System.out.println(difference);


        




    }
}
