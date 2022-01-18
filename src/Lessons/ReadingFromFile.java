package Lessons; //Урок 36 - Чтение из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*String separator = File.separator; //Помещаем системный разделитель в файл ("/")
        String path = separator + "Users" + separator + "admin" + separator + "Desktop" + separator + "test";
        //Конкатенируем строки, в зависимости от системы в переменную separator будет записан системный разделитель
        File file = new File(path);*/
        File file = new File("test");

        Scanner sc = new Scanner(file);
        /*while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close(); //Закрывать сканер после использования */

        String line = sc.nextLine(); //Пример строки 1 2 3
        String[] stringNumbers = line.split(" ");//Метод сплит делит строку, в указанном примере по пробелам(" ")

        int[] numbers = new int[3];
        int counter = 0;

        for(String number: stringNumbers) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
