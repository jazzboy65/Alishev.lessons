package Lessons;//StringBuilder + Продолжение(форматирование строк)

/**
 * В java 2 типа обьектов, изменяемые и неизменяемые,
 * если совершается много конкатенаций лучше использовать метод append
 */

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend"); //метод chaining - по цепочке добавляем к StringBuilder новые строки
        System.out.println(sb);
        System.out.printf("String %5d \n",532);
        /**
         * %s, - то, что после запятой будет вставлено в %s
         * %d, - то же самое только цифры
         * %f, - то же самое, цифры с плавающем запятой
         * Количество параметров, должно соответствовать количеству обозначений с %
         * Обозначений может быть сколько угодно и где угодно:
         * System.out.printf("%f This is %s a string, %d",10.4,"my",18);
         *%10d - "10" ширина указанного в параметре числа, вне зависимости какой ширины это число
         * System.out.printf("String %5d",532);
         * Вывод: String    532 - 1 пробел между строками, 2-3 из за %5d, далее само число 532
         * \n - совершает перенос строки, пример:("sdfsdf %10d \n"532);
         * %-10d - числа будут идти слева
         * %.2f - два числа после точки, для флоат параметров, при этом число типа флоат округляется
         */
        System.out.printf("String %10d \n",532);
        System.out.printf("String %10d \n",5);
        System.out.printf("String %10d \n",10000);
        System.out.printf("String %10d \n",1000000000);
        System.out.printf("String %d \n",532);
        System.out.printf("String %d \n",5);
        System.out.printf("String %d \n",10000);
        System.out.printf("String %d \n",1000000000);
        System.out.printf("String %-10d \n",532);
        System.out.printf("String %-10d \n",5);
        System.out.printf("String %-10d \n",10000);
        System.out.printf("String %-10d \n",1000000000);
        System.out.printf("String %.10f \n",45.2);
    }
}
