package AdvancedJava; //Урок 15. Интерфейс Iterable

/**
 * Iterable (то, по чему можно итерироваться(проходиться) - цикл For each):
 * Классы реализующие интерфейс Iterable - https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
 *
 * !Через For each - нельзя удалять элементы!
 *
 * Но это можно сделать через Iterator
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInfo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;

        //Before Java 5

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if(idx == 1) {
                iterator.remove();
            }

            idx++;
        }

        System.out.println(list);

        //Java 5

//        for (int x: list) {
//        list.remove();
//            System.out.println(x);
//        }
    }
}
