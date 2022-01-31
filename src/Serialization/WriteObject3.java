package Serialization; //Урок 47. Сериализация ч.3 - Transient, SerialVersionUID

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject3 {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"),new Person(2,"Mike"),new Person(3,"Tom")};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

