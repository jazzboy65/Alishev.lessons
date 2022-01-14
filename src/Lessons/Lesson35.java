package Lessons; //Анонимные классы

interface AbleToEat {
    void eat();
}

public class Lesson35 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };

        ableToEat.eat();

        Hero hero1 = new Hero() {
            /**
             * При создании объекта можно создать анонимный класс,
             * который наследуется от Hero и переопределяет метод eat.
             * Hero hero1 = new Hero()... не объект класс hero, а лежит объект наследник класса Hero
             * с переопределённым методом eat.
             */
            public void eat() {
                System.out.println("Other hero is eating");
            }
        };
    }
}
