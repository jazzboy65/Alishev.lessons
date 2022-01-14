package Lessons;//Wildcards

import java.util.ArrayList;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Hero> listOfHeroes = new ArrayList<>();
        listOfHeroes.add(new Hero(1));
        listOfHeroes.add(new Hero(2));

        List<Warior> listOfWarrior = new ArrayList<>();
        listOfWarrior.add(new Warior());
        listOfWarrior.add(new Warior());

        test(listOfHeroes);
        test(listOfWarrior);

    }
    private static void test() {

    }
    private static void test(List<? extends Hero> list) {
        /**
         * List<?> - wildcard, "?" означает что в этот метод можно передать list любых обьектов
         * List<? extends Hero> - мы можем поставить в List только те элементы, являются либо Hero,
         * либо его потомками
         * List<? super Hero> - в этом листе будут все элементы либо класса Hero, либо выше (Object):
         * Object
         * Hero
         * Warrior
         *
         */
        for (Hero hero : list) {
            hero.eat();
        }
    }
}
