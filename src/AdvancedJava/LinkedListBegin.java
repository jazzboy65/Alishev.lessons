package AdvancedJava; //LinkedList(Связанный список) - урок 3

/*
Методы LinkedList и ArrayList одинаковы. Если нужно выполнять много вычислений
предпочтительнее использовать ArrayList - он быстрее LinkedList во много раз.
(Пример метод get), но при условии что в методе не указывается индекс, иначе
LinkedList быстрее (пример метод *.add(0, i)) из цикла ниже).

Области применения:
- Много записей в конец листа, считываний из листа - ArrayList
- Удаление элементов, добавление элементов в начало листа - LinkedList
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBegin {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        /*
        head -> [1] -> [2] -> [3] -> [4]
        Каждый из элементов называется узлом, и в каждом узле есть само значение и есть ссылка
        на следующий узел.
        "head" - головной узел.
         */


        List<Integer> arrayList = new ArrayList<>();
        //[1] [2] [3] [4]

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
