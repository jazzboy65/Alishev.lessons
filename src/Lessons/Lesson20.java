package Lessons; //Конструкторы



/**
 * это такие методы, которые вызываются при создании нового обьекта,
 * конструктор конструирует обьект, т.е. он инициализирует его поля(атрибуты)
 * у конструктора нет типа возвращаемого значения,
 * имя конструктора должно совпадать с именем класса и быть с большой буквы
 */


public class Lesson20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Bob",20);
    }
}

class Human1 {

    private String name;
    private int age;

    public Human1() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        //При создании объекта с пустыми параметрами,вызывает принт
    }

    public Human1(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора");
        //При создании объекта с одним параметром будет второй принт
/**
 * Перегрузка методов, в одном классе мы можем иметь несколько методов с одним и тем же названием
 * До тех пор пока у них разные параметры, и язык определяет какой метод вызывать в зависимости от параметров
 */

    }
    public Human1(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
        //При создании объекта с двумя параметрами будет третий принт
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

