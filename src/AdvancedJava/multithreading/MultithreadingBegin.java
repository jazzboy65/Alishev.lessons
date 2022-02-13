package AdvancedJava.multithreading;//Урок 16. Введение в многопоточность

/**
 * Многопоточность позволяет нам выполнять код паралельно с другим кодом
 * Несколько поток не синхронизируются по умолчанию
 * 2 способа создания потоков:
 *
 * 1)создание класса и наследование от класса Thread -> переопределение метода run() ->
 * создание в main экземпляра класса созданного класса -> *.start()
 * (Пример myThread myThread = new myThread();
 *
 * 2)создание класса и реализация интерфейса Runnable -> переопределение метода run() ->
 * создание в main экземпляра класса Thread в качестве аргумента передается новый объект
 * созданного класса -> *.start() (Пример Thread thread = new Thread(new Runner());)
 *
 * Методы потоков:
 * sleep() - в качестве аргумента принимается время сна в милисекунду(1000мс = 1с)
 */

public class MultithreadingBegin {
    public static void main(String[] args) throws InterruptedException {
        //1 способ создания потоков:
//        myThread myThread = new myThread();
//        myThread.start();//Создаёт новый поток и выполняет то что описано в методе run()
//
//        Thread.sleep(10000);
//
//        myThread myThread2 = new myThread();
//        myThread2.start();
        //2способ создания потоков:
        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");

//        System.out.println("I am going to sleep");
//        Thread.sleep(3000);
//        System.out.println("I am awake!");

        //System.out.println("Hello from main thread");

    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from myThread" + i);

        }

    }
}

class myThread extends Thread {
    public void run() {
        //Переопределение метода run() позволяет выполнить код в другом потоке
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from myThread" + i);

        }
    }
}
