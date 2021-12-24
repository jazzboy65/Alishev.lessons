package Lessons; //Методы в Java, Тип возвращаемого значения, Параметры метода,Сеттеры и Геттеры

/**
 * *Желательно чтобы поля были видны в пределах одного класса, класса в которых эти поля задекларированы
 */

public class Lesson15To18 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        person1.setName("");
        person1.setAge(-2);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        //person1.setNameAndAge("Роман", 50);
        //String s1 = "Вова";
        //person1.name = "Роман";
        //person1.age = 50;
        //person1.sayHello();
        //person1.CalculateYearsToRetirement();
        //person1.speak(); //Вызов метода пишется с параметрами в (), метод можно вызывать сколько угодно раз
        //person2.setNameAndAge(s1, 20);
        //person2.name = "Вова";
        //person2.age = 20;
        //person2.CalculateYearsToRetirement();
        //person2.speak();
        //int year1 = person1.CalculateYearsToRetirement();
        //int year2 = person2.CalculateYearsToRetirement();
        //System.out.println("Первому человеку до пенсии:" + year1 + " лет");
        //System.out.println("Второму человеку до пенсии:" + year2 + " лет");
        //person1.speak();
        //person2.speak();
    }
}

class Person1 {
    private String name; //при установке модификатора private поле становится видимо только в пределах класса
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName() {//будет возвращаться строка
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительный");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;

    }

    int CalculateYearsToRetirement() { //Метод обязан возвращать целое число
        //после определения типа возвращаемого метода, нельзя возвращать в return тип данных отличный от int
        int years = 65 - age;
        String s = "Hello";
        //System.out.println("Количество лет до пенсии: " + years);
        return years; //Метод прекращает свою работу после return
    }

    void speak() {
        /** () - являются аргументами метода
         * в этом методе нужные данные (поля) для работы метода
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + "мне " + age + " лет");
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

