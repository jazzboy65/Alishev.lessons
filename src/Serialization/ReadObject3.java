package Serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject3 {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            //try with resources - позволяет автоматически закрывать поток и задавать параметры входного потока

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
