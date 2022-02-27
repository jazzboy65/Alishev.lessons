package AdvancedJava.LambdaEx; //Урок 33. Лямбда - выражения ч.1

/**
 * Лямбда выражения - это способ передать кусок кода в метод ИЛИ обойтись
 * без анонимных классов.
 * <p>
 * Это анонимная функция (без названия), которая определена без привязки к выражению.
 * <p>
 * Когда в интерфейсе реализуется ТОЛЬКО! один метод, следует использовать лямбда выражения.
 * <p>
 * В лямбда выражения можно добавлять значения, которые находятся вне аргументов и вне
 * самого лямбда выражения при условии что:
 * 1) Это значение должно быть final(константа)
 * 2) Это значение не должно меняться после объявления
 *
 * В отличии от методов у лямбда выражения нет своей области видимости!(scope или контекст),
 * например не отображается переопределённый метод интерфейса
 *
 */

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                int a = 2;
//                System.out.println("Hello");
//                System.out.println("Goodbye");

                return x + y;
            }
        });

//        runner.run((int x) -> {
//            System.out.println("Hello");
//            System.out.println("Goodbye");
//
//            return 5;
//        });

        runner.run(Integer::sum);
    }
}
