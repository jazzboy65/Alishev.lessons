package Lessons; //Массивы

public class Lesson11 {
    public static void main(String[] args) {
        int number = 10; //Примитивный тип данных, [10]
        char character = 'a'; //Также примитивный тип данных
        String s = "Hello";
        String s1 = new String("Hello");
        int[] numbers = new int[5];//numbers ссылается на [массив] ссылочный тип данных
        //System.out.println(numbers[0]); //индексация начинается с 0-4
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3}; //Когда заранее знаем какие значения поместить
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);

        }
    }
}
