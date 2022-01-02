package Lessons;//Ключевое слово Static

/**
 * Статический метод работает только со статическими переменными,
 * но статический метод не может работать с переменными обьекта.
 * Статические переменные нужны если методу не нужно знать переменные объекта.
 * Статические методы используются, если не нужно создавать объект класса,
 * для того, чтобы воспользоваться этими методами(пример метод Math - коллекция статических математических метдов)
 *
 */

public class Lesson21 {
    public static void main(String[] args) {
        Human2.description = "Nice";
        Human2 h1 = new Human2("Bob", 40);
        Human2 h2 = new Human2("Tom",25);
        //h1.getAllFields();
        //h2.getAllFields();
        //Human2.description = "Bad"; //Статическая переменная изменяется через класс, не через объект
        h1.getAllFields();
        h2.getAllFields();
        //System.out.println(Math.pow(2,4)); //Возведение в степень
        //System.out.println(Math.PI);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3 = new Human2("Bill",18);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}

class Human2 {
    private String name; //Переменные объекта, инициализируются, когда мы создаем объект класса
    private int age;
    private static int countPeople;

    public static String description;//Статическая переменная принадлежит самому классу

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }//методы объекта

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(name + "," + age + "," + description);
    }

    public static void printAllFields() {
        System.out.println(description);
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}

