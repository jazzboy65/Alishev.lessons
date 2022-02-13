package AdvancedJava.collections; //Урок 12. Интерфейс Comparable

/**
 * Comparable (способный быть сравненным). Интерфейс используется для коллекций,
 * имеющих порядок ввода элементов (например TreeSet)
 */

import java.util.*;

public class InterfaceComparable {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Set<Human> humanSet = new TreeSet<>();

        addElements(humanList);
        addElements(humanSet);

        Collections.sort(humanList);

        System.out.println(humanList);
        System.out.println(humanSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Human(4, "George"));
        collection.add(new Human(1, "Bob"));
        collection.add(new Human(2, "To"));
        collection.add(new Human(3, "Katy"));
    }
}

class Human implements Comparable<Human> {
    //Объекты класса Human могут сравниваться между собой, при этом имплементируется метод compareTo()
    private final int id;
    private final String name;



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != human.id) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }


}