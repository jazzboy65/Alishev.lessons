package Lessons; //Введение в параметризацию (generics)

import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal2 = animals.get(2);
        System.out.println(animals);
    }
}
