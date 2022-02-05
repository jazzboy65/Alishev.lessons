package Enum; //Урок 48. Enum (Перечисления)

/*
Enum (Enumiration) - перечисления. Используется когда нужно что - то перечислить (например времена года)
Enum'ы наследуется от класса Enum (Object -> Enum -> Наш Enum, например Season)
instanceof - проверяет является ли объект объектом Enum - класса. (Пример System.out.print(season instanceof Season))
getClass() - даёт тот класс, объектом которого является выбранный элемент (season.getClass())
Конструкторы в Enum являются приватными

Методы enum:
1) *.name() - возвращает название enum в виде строки
2) *.valueOf() - из строки получает enum
3) *.ordinal() - возвращает индекс (индексация с 0) объекта, указанного в enum классе.

Season winter = Season.WINTER;
System.out.println(winter.ordinal()) // вернет 0, т.к. WINTER расположен 1 в enum классе.

 */

public class Enum {
    public static void main(String[] args) {
        Viking viking1 = Viking.RAT;
        viking1.getTranslation();

        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());

        Viking viking = Viking.valueOf("RAT");
        Viking viking2 = Viking.BEAR;
        System.out.println(viking2.getTranslation());
//        Viking viking1 = Viking.BEAR;
//
//        Season season = Season.SUMMER;
//
//        switch (season) {
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("it's cold outside");
//                break;
//            default:
//                System.out.println("Error");
//        }
    }
}
