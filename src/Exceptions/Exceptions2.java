package Exceptions; //Обработка исключений ч.2, выбрасывание исключений

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(sc.nextLine());

            if (x != 0) {
                throw new ScannerException("Пользователь ввёл что-то кроме 0");

                /*try {
                    throw new ();
                    //IOException - Input Output Exception (ошибки ввода/вывода)
                } catch (IOException e) {
                    System.out.println("Пользователь ввёл что-то кроме 0");;
                }*/
                //IOException - Input Output Exception (ошибки ввода/вывода)

            }
        }
    }
}
