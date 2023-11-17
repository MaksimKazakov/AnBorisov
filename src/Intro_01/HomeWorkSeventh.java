package Intro_01;

import java.util.Scanner;

public class HomeWorkSeventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты первой точки (два числа через пробел) => ");
        int firstPointOne = scanner.nextInt();
        int firstPointTwo = scanner.nextInt();
        System.out.print("Введите координаты второй точки (два числа через пробел) => ");
        int secondPointOne = scanner.nextInt();
        int secondPointTwo = scanner.nextInt();
        double result = Distance(firstPointOne, firstPointTwo, secondPointOne, secondPointTwo);
        System.out.printf("Длина отрезка между точками  = %f", result);
    }

    static double Distance(int firstPointOne, int firstPointTwo, int secondPointOne, int secondPointTwo) {
        int powNumber = 2;
        return Math.sqrt((Math.pow((secondPointOne - firstPointOne), powNumber) +
                Math.pow((secondPointTwo - firstPointTwo), powNumber)));
    }
}
