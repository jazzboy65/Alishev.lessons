package Lessons; //Класс Object и метод toString

//Предназначение метода toString - представлять объект в виде строки

public class Lesson24 {
    public static void main(String[] args) {
        Objects o1 = new Objects("object1",1);
        System.out.println(o1);

    }
}

class Objects {
    private String name;
    private int age;

    public Objects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        /* Переопределяем метод toString класса Object, своим методом.
         * При переопределении сигнатур и вызове этого метода
         * на объекте класса будет вызываться этот метод
         */
        return name + "," + age;

    }
}
