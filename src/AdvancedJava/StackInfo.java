package AdvancedJava; //Урок 14. Stack

import java.util.Stack;

/**
 * Класс Stack реализует интерфейс List и наследуется от класса Vector
 * Работает по принципу LIFO("Кто зашёл последним - выходит первым")
 *
 * Похож на стоку блинов)
 *
 * Методы класса Stack:
 * push() - добавляет элемент в stack
 * pop() - достать последний элемент из stack
 * peek() - показывает на элемент который будет извлекаться следующим
 * empty() - возрващает true если стэк пустой, false если в стэке имеются элементы
 *
 * "!" - логическое НЕ пример: while (!stack.isEmpty())
 */

public class StackInfo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
