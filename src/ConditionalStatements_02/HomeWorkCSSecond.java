package ConditionalStatements_02;

import java.util.Scanner;

public class HomeWorkCSSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для расчёта площади прямоугольника введите через пробел два целых числа => ");
        int sideRectangleA = scanner.nextInt();
        int sideRectangleB = scanner.nextInt();
        System.out.print("Для расчёта площади круга введите радиус (целое число) => ");
        int radius = scanner.nextInt();
        if(areaRectangle(sideRectangleA, sideRectangleB) > areaCircle(radius)){
            System.out.println("Прямоугольник закроет круг");
        } else {
            System.out.println("Прямоугольник провалится в круг");
        }

    }
    static int areaRectangle(int sideRectangleA, int sideRectangleB){
        return sideRectangleA*sideRectangleB;
    }

    static double areaCircle(int radius){
        return 3.14 * Math.pow(radius, 2);
    }
}
