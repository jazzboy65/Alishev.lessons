package Lessons;

public class Electrocar {
    private final int id;

    //Пример нестатического вложенного класса
    private class Motor {
        public void startMotor() {
            System.out.println("Motor" + id + " is starting...");
        }
    }
    //Пример статического вложенного класса
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //Пример вложенного в метод класса
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);

            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("Electrocar" + id + " is starting...");
        }
        private void test(Object object) {
    }
}
