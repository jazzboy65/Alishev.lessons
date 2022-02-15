package AdvancedJava.multithreading; //Урок 19. Ключевое слово synchronised (Часть 2)

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * synchronized(*) {} - синхронный блок, который объявлется внутри фигурных скобок метода
 * весь код внутри которых является синхронизированным. Он может исполняться в один момент
 * ТОЛЬКО ОДНИМ ПОТОКОМ.
 * <p>
 * (*) - в круглых скобках указывается объект на котором мы хотим синхронизироваться
 *
 * Если требуется синхронизоваться на каком-объекте СОЗДАВАЙТЕ ОТДЕЛЬНЫЙ ОБЪЕКТ:
 * Пример:
 * Object lock1 = new Object();
 * Object lock2 = new Object();
 *
 * У этих объектов разные мониторы, тем самым мы добиваемся 2(или более) синхронных запусков методов
 */



public class SynchronisedPart2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }
}
