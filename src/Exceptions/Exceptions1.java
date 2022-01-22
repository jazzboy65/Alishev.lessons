package Exceptions; //Урок 37 - обработка исключений ч.1

/*
*
 * Иерархия обработки исключений дилегируется вверх (исключение должно быть обработано не только в самом методе,
 * но и при его вызове.
 * Правильная практика избегать StackTrace и обрабатывать каждое исключение идеально.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }

//        File file = new File("test");
//        try {
//            Scanner sc = new Scanner(file);
//            System.out.println();
//
//            System.out.println("После Scanner'a ");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//        System.out.println("После блока try catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("abdc");
        Scanner sc = new Scanner(file);


    }
}

