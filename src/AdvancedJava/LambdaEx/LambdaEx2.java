package AdvancedJava.LambdaEx; //Урок 34. Лямбда выражения ч.2

import java.util.*;
import java.util.stream.Collectors;

/**
 * Методы для лямбда выражений:
 * 1) *.map() - берет каждый элемент из набора данных и сопоставляет ему новый элемент
 * Пример для массива и List:
 * arr = Arrays.stream(arr).map(a -> a * 2).toArray();
 * list = list.stream().map(a -> a * 2).collect(Collectors.toList());
 *
 * 2)*.filter() - берет каждый элемент из набора данных и фильтрует по условию, пример:
 * arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
 * list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
 *
 * 3)*.foreach() - обход по набору данных, например для вывода каждого элемента:
 * Arrays.stream(arr2).forEach(a -> System.out.println(a));
 * list2.stream().forEach(a -> System.out.println(a));
 *
 * 4) *.reduce() - обход по набору данных, для последующего уменьшения набора данных,
 * например посчитать сумму всех элементов в коллекции/массиве
 *
 * состоит из аккумулятора и переменной!
 *
 * Пример:
 * int sum1 = Arrays.stream(arr3).reduce((acc,b) -> acc + b).getAsInt();
 * int sum2 = list3.stream().reduce((acc,b) -> acc * b).get();
 *
 * Также можно передать в reduce() значение аккумулятора по умолчанию:
 * int sum1 = Arrays.stream(arr3).reduce(0(acc, b) -> acc + b);
 *
 * При этом ПО-УМОЛЧАНИЮ итерация начинается со 2 элемента, а аккумулятор берёт 1 элемент
 *
 * ГЛАВНАЯ ФИШКА ЛЯМБД И СТРИМОВ - МОЖНО ИСПОЛЬЗОВАТЬ НЕСКОЛЬКО МЕТОД ПОДРЯД:
 * int[] newArray = Arrays.stream(arr4).filter(a -> a %2 != 0).map(a -> a * 2).toArray();
 *
 *
 */

public class LambdaEx2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        //Реализация через цикл

//        for (int i = 0; i < 10; i++) {
//            arr[i] = arr[i] * 2;
//            list.set(i,list.get(i) * 2);
//        }

        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());


        //Изменить все элементы в массиве на 3
        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        //Увеличить все элементы на +1
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        //filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        //ForEach метод
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

        //reduce метод
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int product = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum);
        System.out.println(product);

        int[] arr4 = new int[10];
        fillArr(arr4);

        int[] newArray = Arrays.stream(arr4).filter(a -> a %2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArray));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;

        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);

        }
    }
}
