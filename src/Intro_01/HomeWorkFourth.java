package Intro_01;/*
* 1. Написать метод getLastDigit(int number), который принимает на вход число, а возвращает последнюю цифру этого числа.
* 2. В методе main получить число, введенное с клавиатуры, затем вызвать метод getLastDigit,
*    передав ему это число. Вывести на экран результат выполнения метода. Вывести на экран результат выполнения метода.
*/

import java.util.Scanner;

public class HomeWorkFourth {
    public static void main(String[] args) {
        System.out.print("Введите число, не больше 2147483647 => ");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        getLastDigit(number);

    }

    static void getLastDigit(int number){
        System.out.println("Последняя цифра введённого числа - " + number%10);
    }
}
