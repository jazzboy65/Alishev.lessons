package AdvancedJava.anotation; //Урок 35. Аннотации

/**
 * Java Аннотации - это специальный тип комментариев в вашем коде с помощью которых можно:
 *
 * 1)Передавать какие-либо инструкции для Java компилятора
 *
 * 2)Передавать какие-либо инструкции для анализаторов исходного кода
 * (инструменты, которые генерируют документацию из исходного кода)
 *
 * 3)Передавать метаданные, которые могут быть использованы либо вашим
 * Java приложением (с помощью рефлексии), либо другими приложенями или фреймворками
 * (например Spring)
 *
 * Метаданные это данные о данных
 * Они не влияют на непосредственную работу программы, но могут быть выявлены другими
 * программами на этапе компилированя или разработки, которые при этом скорректируют свою работу
 *
 * Примеры:
 * Тег <meta> в HTML который используется для хранения информации о странице,предназначенный для
 * браузеров и поисковых систем (например Ключевые слова)
 *
 * Аннотации в Java, которые дают дополнительную информацию о коде
 *
 * Могут быть аннотированы класс, метод, параметр, поле и т.д.
 *
 * В Java уже есть встроенные аннотации, которые чаще всего используются
 * - @Override - переопределение метода из родительского класса
 * - @Deprecated - метод устарел и его лучше не использовать, при этом устаревний метод можно использовать
 * - @SuppressWarnings - убирает предупреждения из консоли
 *
 * Можно создавать также свои аннотации
 */

public class Info {
}
