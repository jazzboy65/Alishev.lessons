package Lessons; //Приведение примитивных типов

public class Lesson30 {
    public static void main(String[] args) {
        float f = (float) 123.21;
        byte b = (byte) 129;
        long l = 12312L;

        int a = 123;

        long l1 = a; //Приведение типов неявное
        int x = (int) a; //Приведение типов явное
        System.out.println(x);
        double z = a;
        double q = 123.6;
        int x1 = (int) q;
        long x2 = Math.round(q);
        System.out.println(x2);
        System.out.println(b);

    }
}
