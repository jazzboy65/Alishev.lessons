package AdvancedJava.multithreading;//Урок 18. Ключевое слово synchronised (часть 1)

/**
 * Чтобы дождаться находясь в потоке других потоков используется метод join
 * Пример (также при использовании метода необходимо обрабатывать исключение InterruptedException):
 * thread1.join();
 * thread2.join();
 *
 * Состояние гонки* (Race condition) - 2 или более потоков пишут и обновляют одну переменную
 *
 * synchronised(синхронизованный) - ключевое слово, которое синхронизует работу 2 или более потоков
 * при записи в общую переменную
 *
 * Методы также могут быть синхронизованными
 *
 * Для синхронизации нужен объект, т.к. у всех объектов в Java есть монитор, и монитор в
 * 1 единицу времени может принадлежать только 1 потоку
 */


public class SynchronisedPart1 {
    private int counter;


    public static void main(String[] args) throws InterruptedException {
        SynchronisedPart1 test = new SynchronisedPart1();
        test.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
