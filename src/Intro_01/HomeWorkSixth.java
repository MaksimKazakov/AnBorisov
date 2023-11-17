package Intro_01;

import java.util.Scanner;

public class HomeWorkSixth {
    public static void main(String[] args) {
        System.out.print("Введите пятизначное число => ");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        System.out.println("Третья цифра числа  = " + getNumber(number));
    }

    static int getNumber(int number){
        return (number / 100) % 10;
    }
}
