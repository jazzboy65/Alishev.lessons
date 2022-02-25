package AdvancedJava.Regexp; //Урок 31. Регулярные выражения ч.2

import java.util.Arrays;

/**
 * .split() - превращает строку в массив, отделяя элементы по аргументу
 * .replace() - может заменить что-то в оригинальной строке на что-то новое, принимает на вход строку
 * .replaceAll() - принимает на вход регулярное выражение - b.replaceAll(" ",",")
 * .replaceFirst() - заменяет первое появление паттерна в тексте
 *
 */

public class Regexp2 {
    public static void main(String[] args) {
        String a = "Hello2131231321321321there1231231321231321231hey";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello213546465465465there4654564654564654654hey";
        String modifiedString = b.replaceAll("\\d+","-");
        String modifiedString2 = b.replaceFirst("\\d+","-");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);


    }
}
