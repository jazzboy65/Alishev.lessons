package Lessons.InterfacesLesson26;

public class Test {
    public static void main(String[] args) {
        /**
         * Основы полиморфизма:
         * мы рассматриваем объекты классов Animal и Person,
         * как нечто реализующее интерфейс
         */
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        /**
         * ^ т.к. интерфейс Info реализовают оба класса(Animal, Person),
         * это позволяет указывать тип переменной не Animal, Person, а Info
         */
        info1.showInfo();
        info2.showInfo();
        /**
         * ^ мы сужаем все методы классов Animal,Person до единственного метода
         * определённого в интерфейсе (метод showInfo, методы sleep и sayHello
         * становяться недоступными для выбора)
         */
        outputInfo(info1);
        outputInfo(info2);

        Animal animal1 = new Animal(1);
        Person person1 = new Person("John");

        outputInfo(animal1);
        outputInfo(person1);

        /**
         * Также, мы можем объекты классов Animal/Person, поместить в качестве аргументов
         * в метод "outputInfo", благодаря реализации интерфейса в этих классах
         */
    }
    public static void outputInfo(Info info) {
        info.showInfo();

        /**
         * Метод принимает нечто, реализованное в классе info,
         * при этом мы можем использовать методы указанные в самом интерфейсе
         */
    }
}
