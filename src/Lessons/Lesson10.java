package Lessons; //Оператор Switch

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = sc.nextInt(); //Можно также использовать строковую переменную
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
