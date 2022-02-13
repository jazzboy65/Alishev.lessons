package AdvancedJava.collections;
//Урок 8. hashcode() и equals()
//Урок 9. Контракты hashcode() и equals()

/**
 * Для сравнения объектов по смыслу следует использовать переопределение hashcode() и equals()
 * (Если у наших объектов равны поля - то мы хотим считать эти объекты равными)
 * equals работает медленее, т.к. для работы ему необходимо пройтись по всем полям объектов
 *
 * Когда мы проверяем объекты на равенство - сначала вызывается метод hashcode(), если метод отработал
 * правильно метод equals() не вызывается, если неправильно - вызывается.
 *
 * Метод hashcode() не всегда работает правильно, поэтому он работает в связке с equals()
 *
 * Хеш-функция или функция свёртки — функция, осуществляющая преобразование массива входных данных произвольной длины
 * в выходную битовую строку установленной длины, выполняемое определённым алгоритмом.
 * Преобразование, производимое хеш-функцией, называется хешированием.
 * Исходные данные называются входным массивом, «ключом» или «сообщением».
 * Результат преобразования называется «хешем», «хеш-кодом», «хеш-суммой», «сводкой сообщения».
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);


    }
}

class Person {
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    //{object} -> {int} - объект любой длины конвертируется в целой число фиксированной длины.
    //Колизия - хэши совпадают, но сами объекты разные, по этой причине и используется контракт hashcode() - equals()
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
    Контракт hashcode() equals()
    1) У 2 объектов вызываем метод hashcode()
    Если хэши разные - 2 объекта точно разные (выполняется быстро)

    2) Если хэши одинаковые то вызывается метод equals() и он выдает точный ответ
     */

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';


    }
}
