package Exceptions; //Обработка исключений ч.3,Checked и Unchecked исключения

/*
Checked Exception (Compile time exception  - исключения возникающие во время компиляции, без их обработки
программа не скомпилируется. В прошлых уроках подробно рассмотрены. Чаще всего это исключительные случаи
в работе программы.

Unchecked Exception (Runtime exception - исключения возникающие во время выполнения программы, т.е.
ошибка при выполнении программы.
Одно из самых распространненых это деление на 0. Например int x = 1/0;
Распространённые типы Unchecked Exception:
1) NullPointerException - в переменной лежит null
2) ArrayIndexOfBoundException - выход за пределы массива


 */


public class Exceptions3 {
    public static void main(String[] args) {
        /*Пример NPE
        String name = null;
        name.length();
        //Пример ArrayIndexOfBoundException
        int[] arr = new int[2];
        System.out.println(arr[2]);
         */

    }
}
