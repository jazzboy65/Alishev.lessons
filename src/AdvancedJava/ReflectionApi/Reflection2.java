package AdvancedJava.ReflectionApi;

/**
 * Что можно делать с помощью рефлексии?
 *
 * Для объекта класса Class:
 * *Создавать новые объекты класса (по умолчанию вызывает пустой конструктор) - newInstance()
 * Получать методы по сигнатуре - getMethod(...)
 * Получать конструктор по сигнатуре - getConstructor(...)
 *
 * Для объекта класса Method:
 * Вызывать методы - invoke()
 * ...
 *
 * *Метод newInstance() можно вызывать не только на объектах класса Class,
 * но и на объектах класса Constructor
 *
 * Сигнатура метода в терминах рефлексии это имя и набор типов параметров:
 * Method m = stringClass.getMethod("indexOf",String.class, int.class);
 *
 * Для второго аргумента у метода getMethod() используется Java varargs -
 * можно передать любое число аргументов):
 * public Method getMethod(String name, Class<?>... parameterTypes)
 *
 *
 *
 *
 */

public class Reflection2 {
}
