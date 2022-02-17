package AdvancedJava.multithreading;//Урок 22 методы wait() и notify()

import java.util.Scanner;

/**
 * Для реализации паттерна producer-consumer можно воспользоваться методами wait() и notify()
 * Эти методы есть у любого объекта в классе Object.
 * <p>
 * Метод wait() может вызываться только в пределах синхронизованного блока.
 * wait(*)  * - может принимать на вход таймаут в милисекундах
 * * - может принимать на вход таймаут в милисекундах
 *
 * notify() пробуждает один поток который ждёт, при вызове не освобождает монитор
 *
 * Методы wait() и notify() - вызовы привязываются к контекстам где находятся, при этом
 * если класс статический нам необходимо указывать объект на котором будут выполняться этим методы.
 *
 * Если мы не указываем объекта для вызова, по умолчанию вызов происходит на объекте this.
 *
 * Пример:
 * lock.wait()
 */

public class MethodsWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait();
            //1)Отдаём лок (this) на котором шла синхронизация, как будто мы вышли из синхронизированного блока
            //2)В текущем потоке ждём пока будет вызван notify(), именно на этом объекте
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
            //notifyAll() - пробуждает все потоки которые ждут

            Thread.sleep(5000);
        }
    }
}
