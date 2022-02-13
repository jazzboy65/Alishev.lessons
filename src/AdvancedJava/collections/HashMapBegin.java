package AdvancedJava.collections; //Урок 5. HashMap - введение

import java.util.HashMap;
import java.util.Map;

/**
 * Все классы, реализующие интерфейс Map, хранят в себе пары ключ - значение.
 * Map по сути является отображением. Пример - словарь (есть слово (ключ), и его перевод(значение))
 *
 * Каждая пара ключ - значение в Java это Entry.
 *
 * Элементы в HashMap не имеют порядка.
 *
 * В Map не может быть одинаковых ключей, но значения могут.
 *
 * Метод применения:
 * Когда не важен порядок ключ - значение, а важно лишь их наличие.
 *
 * Методы Map:
 * 1) *.put() - принимает на вход 2 аргумента, ключ и значение
 * при этом если уже для созданного ключа указать новое значение, старое будет изменено на новое.
 * 2) *.get() - получить значение по ключу. Если указать ключ с несуществующим значением вернется null.
 * 3) *.entrySet() - возвращает набор всех пар ключ - значение для выбранной map.
 * 4) *.getKey() - возвращает ключ объекта
 * 5) *.getValue() - возвращает значение объекта
 */

public class HashMapBegin {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");

        System.out.println(map);

        map.put(3,"Другое значение для ключа 3");
        System.out.println(map);

        System.out.println(map.get(1));

        for(Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
