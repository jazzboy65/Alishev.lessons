package Lessons; //Ввод данных, класс Scanner;
import java.util.Scanner;
/**
 * класс String уже импортирован и лежит в пакете java.lang
 * все классы/пакеты java.util не импортированы
 * * Scanner(System.in) - (System.in) - стандартный поток входных данных
 */
public class Lesson7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = sc.nextLine();
        System.out.println("Вы ввели " + string);
        System.out.println("Введите какое - нибудь число");
        int x = sc.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
