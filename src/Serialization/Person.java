package Serialization;

import java.io.Serializable;

public class Person implements Serializable {



/*
Для записи в файл объектов в классе необходимо реализовать интерфейс Serializable
Ключевое слово Transient позволяет не сериализовывать поле, указывается при декларировании поля.
При запуске программы при указании Transient в поле - будет заполнено значением по умолчанию(String - null, 0 - int и т.д)

serialVersionUID - Среда выполнения сериализации связывает с каждым сериализуемым классом номер версии, называемый
serialVersionUID, который используется во время десериализации для проверки того, что отправитель и получатель
сериализованного объекта загрузили классы для этого объекта, которые совместимы в отношении сериализации.

 */

    private static final long serialVersionUID = 4746105481870303615L;
    /**
    !!!Важно при изменении класса (например при добавление новых полей и т.д.) перегенерировать/поменять serialVersionUID!!!
     */
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
