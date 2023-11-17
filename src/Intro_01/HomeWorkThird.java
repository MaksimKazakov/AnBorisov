package Intro_01;/*Написать метод, который принимает на вход значение промежутка времени в секундах.
Метод выводит на экран этот промежуток времени в виде часов минут и секунд, суток и недель. */

import java.util.Scanner;

public class HomeWorkThird {
    public static void main(String[] args) {
        System.out.print("Введите число => ");
        Scanner scaner = new Scanner(System.in);
        long timeInSeconds = scaner.nextInt();
        isTime(timeInSeconds);
    }

    static void isTime(long timeInSeconds) {
        System.out.println("Результат введенного числа в часах = " + timeInSeconds / 3600);
        System.out.println("Результат введенного числа в минутах = " + timeInSeconds  / 60);
        System.out.println("Результат введенного числа в секундах = " + timeInSeconds );
        System.out.println("Результат введенного числа в сутках = " + timeInSeconds / (60*60*24));
        System.out.println("Результат введенного числа в неделях = " + timeInSeconds / (60*60*24*7));
    }
}
