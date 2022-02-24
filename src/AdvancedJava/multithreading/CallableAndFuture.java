package AdvancedJava.multithreading; //Урок 29. Интерфейсы Callable и Future

import java.util.Random;
import java.util.concurrent.*;

/**
 * Интерфейсы Callable и Future позволяют возвращать значение из потоков,
 * также позволяют выбрасывать исключения из потоков
 *
 * Для лямбда выражений что Runnable что Callable выглядят одинаково, поэтому лучше не использовать
 * replace
 *
 * Для получения объекта после завершения потока стоит использовать интерфейс Future
 * Future и Callable обязательно параметризовывать.
 *
 * Методы Future:
 * *.get() - получить объект/исключение после окончания выполнения потока, выводит return после окончания
 * выполнения потока.
 */

public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception{
                System.out.println("Starting");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");

                Random random = new Random();
                int randomValue = random.nextInt();

                if(randomValue < 5) {
                    throw new Exception("Something bad happened");
                }

                return random.nextInt(10);
            }

        });
        executorService.shutdown();

        try {
            int result = future.get(); //
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause(); //Метод получения причины исключения
            System.out.println(ex.getMessage());

        }
    }
}
