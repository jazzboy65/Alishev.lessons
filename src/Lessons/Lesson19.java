package Lessons; //Ключевое слово this

public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Top");
        human1.setAge(18);
        human1.getInfo();
        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("Bob");
        human2.getInfo();
    }
}

class Human {
    /**
     * Чтобы внутри метода в классе обратиться к переменным класса,
     * мы должны использовать this.название атрибута, используется в сеттерах
     * ключевое слово this вызывает обьект внутри класса
     */
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + "," + age);
    }
}
