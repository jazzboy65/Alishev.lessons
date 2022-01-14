package Lessons; //Восходящее и нисходящее преобразование

public class Lesson32 {
    public static void main(String[] args) {

        //Upcasting - восходящее преобразование, обьект Dog воспринимает как его родителя Animal
        //Следовательно мы совершаем преобразование от родителя к наследнику
        Animal animal = new Dog();
        Dog dog = new Dog();
        Animal animal1 = dog;

        //Downcasting - нисходящее преобразование
        Dog dog1 = (Dog) animal1;
        dog1.bark();
    }
}
