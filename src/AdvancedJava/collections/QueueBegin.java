package AdvancedJava.collections; //Урок 13. Очередь (Queue)

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Реализует структуру данных FIFO(Первый зашёл - первый вышел)
 * Классы реализующие интерфейс Queue -> https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
 *
 * Методы выбрасывающие исключения из за ошибки (например IllegalStateException при добавлении элемента в заполненную очередь):
 * 1)add() - добавляет элемент в очередь
 * 2)remove() - достаёт 1 элемент из очереди
 * 3)element() - показывает на элемент который будет извлекаться следующим из очереди оставляя его там
 *
 * Методы возвращающие специальное значение (например false при добавлении элемента в заполненную очередь):
 * 1)offer() - добавляет элемент в очередь
 * 2)poll() - достаёт 1 элемент из очереди
 * 3)peek() - показывает на элемент который будет извлекаться следующим из очереди оставляя его там
 */

public class QueueBegin {
    public static void main(String[] args) {
        Person1 person1 = new Person1(1);
        Person1 person2 = new Person1(2);
        Person1 person3 = new Person1(3);
        Person1 person4 = new Person1(4);

        Queue<Person1> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

//        for(Person1 person: people) {
//            System.out.println(person);
//        }

        Queue<Person1> people1 = new ArrayBlockingQueue<Person1>(3);
        //ArrayBlockingQueue<>() - очередь настраиваемой длины

        System.out.println(people1.offer(person3));
        System.out.println(people1.offer(person2));
        System.out.println(people1.offer(person4));
        System.out.println(people1.offer(person1));


    }
}

class Person1 {
    private int id;

    public Person1(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                '}';
    }
}
