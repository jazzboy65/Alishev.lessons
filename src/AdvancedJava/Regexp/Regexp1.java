package AdvancedJava.Regexp;//Урок 30. Регулярные выражения ч.1

/**
 * Регулярные выражения описывают группу строк.
 *
 * Хорошо подходит для проверки валидности email
 *
 * Методы regex:
 * 1)*.matches() - вызывается на объекте класса String и принимает на вход строку,
 * возвращает boolean значение
 *
 *
 * Регулярные выражения:
 * \\d - одна цифра - a.matches("\\d")
 * \\w - одна английская буква = [a-zA-Z]
 *
 * + - один или более - a.matches("\\d+")
 * * - ноль или более - a.matches("\\d*")
 * - - минус или более чисел в зависимости от значения \\d - a.matches("-\\d*") - от - до + бесконечности
 * ? - символ который идет до него может быть, а может не быть, 0 или 1 символов до - b.matches("-?\\d*")
 *
 * (x|y|z) - описываем один или несколько артефактов(знаков) до выражения, в качестве разделителя |
 *  - c.matches("(-|\\+)?\\d*") или c.matches("([-+])?\\d*"))
 *
 *  [a-zA-Z] - в квадратных скобках описываются все английские буквы, которые могут встречаться в разных регистрах
 * ИЛИ [abc] = (a|b|c) - d.matches("[a-z]?\\d+"), d.matches("[a-z]+\\d+") - если букв больше 1
 * ИЛИ d.matches("[a-z31]+\\d+") - если перед значением есть не только буквы но и цифры (1,3)
 *
 * [^abc] или [^a-c] - отрицание, мы хотим все символы кроме [abc] - e.matches("[^abc]*")
 *
 * . - любой символ
 *
 * \\. - превращение любого специального символа в натуральный -  url.matches("http://www\\..+\\.(com|ru)")
 *
 * {2} - 2 символа до (\\d{2}) - f.matches("\\d{1,}")
 * {2,} - 2 или более символов (\\d{2,})
 * {2,4} - от 2 до 4 символов (\\d{2,4})
 */



public class Regexp1 {
    public static void main(String[] args) {
        String a = "-41241";
        String b = "41241";
        String c = "+121345";

        System.out.println(a.matches("([-+])?\\d*"));
        System.out.println(b.matches("([-+])?\\d*"));
        System.out.println(c.matches("([-+])?\\d*"));

        String d = "aad111333333f12345";
        System.out.println(d.matches("[a-z31]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{1,}"));

    }
}
