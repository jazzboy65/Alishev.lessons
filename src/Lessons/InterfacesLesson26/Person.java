package Lessons.InterfacesLesson26;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override //анотация Override обязывает метод быть таким же как и в интерфейсе
    public void showInfo() {
        System.out.println("Name is " + this.name);

    }
}
