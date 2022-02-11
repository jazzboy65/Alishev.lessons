package AdvancedJava; //Урок 11. Интерфейс Comparator (Сортировка коллекций)

/**
 * Для сортировки коллекций используется интерфейс Comparator (Тот, кто сравнивает).
 * Реализация:
 * 1)Создать class реализующий интерфейс с переопределением метода compare (или других методов)
 * Collections.sort(animals, new StringLengthComparator())
 * 2)Использовать анонимный класс - Collections.sort(personals, new Comparator<Personal>()
 * и прописывать логику в самой сортировке
 * 3)Использовать лямбда выражения
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("qwerty");
//        animals.add("x");
//        animals.add("bird");
//
//        Collections.sort(animals, new StringLengthComparator());
//        //Natural Ordering - если буквы то лексиграфический порядок (а - z) и т.д.,
//        //данная сортировка используется по умолчанию
//        System.out.println(animals);
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(0);
//        numbers.add(500);
//        numbers.add(100);
//
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2) {
//                    return -1;
//                } else if(o1 < o2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(numbers);

        List<Personal> personals = new ArrayList<>();
        personals.add(new Personal(3, "Mike"));
        personals.add(new Personal(1, "Bob"));
        personals.add(new Personal(2, "Katy"));

        Collections.sort(personals, new Comparator<Personal>() {
            @Override
            public int compare(Personal o1, Personal o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(personals);

    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
        /*
        объект1 > объект2 => 1;
        объект1 < объект2 => -1;
        объект1 == объект2 => 0;
         */
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Personal {
    private final int id;
    private final String name;

    public Personal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
