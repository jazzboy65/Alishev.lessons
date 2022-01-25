package Exceptions; //Обработка исключений ч.4

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {

        try {
            run();
        } catch (IOException | ParseException e) {
            //Multi-Catch позволяет не писать много блоков с catch, а перечислять в одном все виды возможных исключений
            e.printStackTrace();
        }

        try {
            run();
        } catch (Exception e) {
            //Также можно использовать родительский класс Exception для поимки любых исключений, без
            //указания одного или нескольких исключений (Пример выше)
        }

    }


    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }
}
