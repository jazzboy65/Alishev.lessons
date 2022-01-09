package Lessons; //Полиморфизм

/**
 * Полиморфизм это способность метода обрабатывать данные разных типов.
 * Мы можем обраться к классу Dog через переменную родительского типа.
 * C помощью полиморфизма можно сделать код меньше, а во вторых многоразово
 */

public class Lesson29 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        /*^ здесь мы рассматриваем собаку как животное
        поэтому метод animal.bark() - недоступен для использования */

        Dog dog = new Dog();
        //^ здесь мы рассматриваем собаку как собаку
        dog.bark();
        dog.eat();

        animal.eat();/*всегда вызывается тот метод, который определён в классе потомке,
        если такой имеется - это называется позднее связывание, если реализация в классе потомке
        отсутствует - будет вызвана реализация в классе родителе */
        Cat cat = new Cat();

        test(dog);
        test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();

    }
}
