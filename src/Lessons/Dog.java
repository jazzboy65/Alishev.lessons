package Lessons;

import Lessons.Animal;


/**
 * Класс Lessons.Dog наследуется от класса Animal через extends
 * Класс Animal является родителем для класса Lessons.Dog
 * Переопределение методов: метод eat из класса Animal мы заменяем
 * методом eat из класса Dog(класс - потомок) если создаваемый объект класса Dog
 * Наследование используется когда есть общий класс и мы хотим получить какие - то методы
 * из общего класса, а какие то из класса потомка, тем самым не придется прописывать
 * методы принадлежащие всем животным в целом
 */

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void showName() {
        System.out.println(name);
    }
}
