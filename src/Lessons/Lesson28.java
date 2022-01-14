package Lessons; //Модификаторы доступа public,private,default,protected

import Lessons.Lessons28.Person;

public class Lesson28 extends Person {
    /**
     *     public int id; - разрешает доступ к полю, классу, методу везде на протяжении одного проекта
     *     private int age; - разрешает доступ только в пределах того класса, где это поле задекларировано
     *     int age1;  - default устанавливается по умолчанию, если мы не указываем модификатор,все что default доступно в пределах этого пакета
     *
     *     protected int age2; - доступно в пределах одного пакета, доступны всем подклассам, даже если эти
     *     подклассы вне пакета, где эти поля/методы были декларированы
     *     класс совпадающий с названием файла обязательно должен быть публичным, класс не может быть private
     *     Класс не может быть private
     */
    public Lesson28() {
        name2 = "Tom";
    }

}
