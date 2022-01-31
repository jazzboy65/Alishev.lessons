package Serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


//            2 Способа сериализации массива
//            1) Через цикл for, работая с каждым элементом поотдельности:


//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

//            2) Через объект:

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
