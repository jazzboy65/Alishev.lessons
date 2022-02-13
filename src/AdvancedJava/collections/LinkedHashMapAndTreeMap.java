package AdvancedJava.collections; //Урок 6. LinkedHashMapAndTreeMap

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * LinkedHashMap сохраняет порядок добавления новых пар ключ-значение в Map.
 * TreeMap сортирует пары ключ-значение по ключу.
 */

public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        //Внутри не гарантируется никакого порядка
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        //В каком порядке ключ - значение были добавлены, в таком порядке они и вернутся
        Map<Integer,String> treeMap = new TreeMap<>();
        //Гарантирует, что пары ключ - значение будет отсортированы по ключу (для чисел от меньшего к большему,
        //для строк используется лексикографический порядок. (Естественный порядок Natural Ordering)

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }
    public static void testMap(Map<Integer,String> map) {
        map.put(39,"Bob");
        map.put(12,"John");
        map.put(78,"Ben");
        map.put(0,"Tim");
        map.put(1500,"Lewis");
        map.put(7,"John");

        for(Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
