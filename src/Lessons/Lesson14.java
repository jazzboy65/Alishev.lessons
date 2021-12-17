package Lessons;//Классы и обьекты

public class Lesson14 {
    /**
     * Публичный класс может быть только один, вспомогательных классов сколько угодно
     * Имя класса должно соответствовать имени java - файла
     * class это шаблон, пример из жизни - человек
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        System.out.println("Меня зовут "+ person1.name + ","+ "мне "+ person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Vladimir";
        person2.age = 20;
        System.out.println("Меня зовут "+ person2.name + ","+ "мне "+ person2.age + " лет");

    }
}

class Person {
    /**
     * У класса могут быть:
     * 1) Данные (поля)
     * 2) Действия, которые он может совершать (методы)
     */
    String name; //У всех объектов будет имя и возраст
    int age;

}
