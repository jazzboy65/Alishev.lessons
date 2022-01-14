package Lessons;//Классы обертки примитивных типов

//Double,Float,Long,Integer,Short,Byte,Character,Boolean

public class Lesson31 {
    public static void main(String[] args) {
        int x = 1;


        Integer x2 = 123; //Автоупаковка в обертку
        int y = x2; //Распаковка из обёртки
        Integer.parseInt("123");
    }
}
