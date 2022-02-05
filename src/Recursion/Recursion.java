package Recursion; //Урок 49. Рекурсия

/*
Рекурсия - вызов метода в теле этого же метода

Пример с факториалами:

4! = 4 * 3 * 2 * 1
 */

public class Recursion {
    public static void main(String[] args) {
//        counter(3);

        System.out.println(factorial(4));
        //fac(4)
        //4 * 6 = 24
        //3 * 2 = 6
        //2 * 1 = 2
        //fac(1) return 1
    }

    private static void counter(int n) {
        if (n == 0) return;

        System.out.println(n);

        counter(n - 1);

    }

    private static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }
}
