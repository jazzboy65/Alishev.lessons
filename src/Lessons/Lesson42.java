package Lessons; //Урок 42. Метод equals() и String pool

/*
Сравнение через == работает с примитивами, но не с обьектами, потому что в объектах сравниваются ссылки на
объекты, а они всегда разные. Для того чтобы сравнивать объекты нужно использовать метод equals().

В данном уроке мы переопределяем работу метода equals(), для того чтобы сравнивать объекты.

String pool - множество всех элементов String.

String s1 = "1";
String s2 = "1";

При таком вводе объект s2 не создает новую строку, а делает ссылку на объект s1 из String pool.
Для сравнения строк можно использовать == а также метод equals, предпочтительнее последний.

Крутые фишки:

Метод substring() - Пример употребления:
String x = "Hello123".substring(0,5); //Вывод Hello
*/

public class Lesson42 {
    public static void main(String[] args) {

        Weapon weapon1 = new Weapon(1);
        Weapon weapon2 = new Weapon(1);

        System.out.println(weapon1.equals(weapon2));
    }
}

class Weapon {
    private final int id;

    public Weapon(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Weapon otherWeapon = (Weapon) obj;
        //Пример с даункастингом, создаем новый обьект и переопределяем его как экземляр класса Weapon от класса Object
        return this.id == otherWeapon.id;
    }
}

