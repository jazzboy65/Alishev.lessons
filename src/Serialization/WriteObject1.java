package Serialization; //Урок 45 Сериализация ч.1

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class WriteObject1 {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1,"Bob"),new Person(2,"Mike"),new Person(3,"Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            /*
            Для того чтобы ObjectOutputStream работал и записывал объекты в файл
            нужен FileOutputStream.
             */
            //oos.writeObject(person1);
            //oos.writeObject(person2);

            oos.writeInt(people.length);

            for(Person person: people) {
                oos.writeObject(person);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
