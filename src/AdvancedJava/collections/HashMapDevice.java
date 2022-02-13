package AdvancedJava.collections; //Урок 9. Устройство HashMap

/**
 * HashSet в своей реализации использует HashMap.
 * HashMap использует в своей реализации массив, к которому можно быстро обращаться по индексу
 * в каждой ячейки массива хранится связанный список (LinkedList).
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDevice {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Bob",25);
        map.put("Katy",15);
        map.put("Bill",40);

        Set<String> set = new HashSet<>();
    }
}
