package Lessons; //Цикл do - while
/** while сначала проверяет условие, а потом выполняет инструкции
 * do - while сначала выполняет инструкции, а потом проверяет условие
 */

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = sc.nextInt();
        } while (value !=5);
        System.out.println("Вы ввели 5");
    }
}
