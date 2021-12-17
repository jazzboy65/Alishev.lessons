package Lessons; //Методы в Java

public class Lesson15 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        person1.speak(); //Вызов метода пишется с параметрами в (), метод можно вызывать сколько угодно раз
        Person1 person2 = new Person1();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
    }
}

class Person1 {
    String name;
    int age;

    void speak() {
        /** () - являются аргументами метода
         * в этом методе нужные данные (поля) для работы метода
         */
        for (int i = 0; i <3; i++) {
            System.out.println("Меня зовут " + name + "," + "мне "+ age + " лет");
        }
        //System.out.println("Меня зовут " + name + "," + "мне "+ age + " лет");
    }
    void sayHello() {
        /**Методы всегда пишутся с маленькой буквы, если два или слов в методе, то
         * начиная со второго слова - слова пишутся с большой буквы
         * этому методу не нужны данные(поля) для работы метода
         */
        System.out.println("Привет");
    }
}

