package AdvancedJava; //Урок 2,3 - ArrayList введение

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Java Collections Framework (JCF) - это набор связанных классов и интерфейсов, в которых реализован
 * функционал по хранению объектов.
 *
 * Класс ArrayList - это класс, которые реализует функционал динамического массива (расширяется при
 * добавлении новых объектов)
 *
 * В <> нельзя указывать примитивные типы (int и т.д.) только ссылочные.
 * Методы ArrayList:
 * 1) add() - добавление элемента
 * 2) get() - получение элемента по индексу
 * 3) size() - размер ArrayList
 * 4) remove() - удаление элемента по индексу
 * 5) asList() - (добавление нескольких элементов подряд) Girl girl = new Girl("Mary", 12,
 *                     Arrays.asList(new Doll("Barbie", "Mattel"), new Doll("Princess", "Hasbro")));
 * * Является неизменяемым, чтобы сделать его изменяемым, создать новый обычный ArrayList,
 * передав ему в качестве аргумента список, полученный от Arrays.asList().
 *
 * Пример:
 * List<String> list = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla"));
 * list.add("Mercedes");
 * new ArrayList<>() - () - указываем размер внутреннего массива
 */

public class ArrayListBegin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        /*System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));
        System.out.println(arrayList.size());*/

        //Способы прохождения по элементам ArrayList
        /* for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Integer x: arrayList) {
            System.out.println(x);
        }*/

        list.remove(5);
        System.out.println();

        //Проводим много удалений из нашего листа
        list = new LinkedList<>(); // - сослали переменную коллекции на новый объект класса LinkedList

        }
    }



