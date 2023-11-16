package Cycle_03;
import java.util.Scanner;
public class HomeWorkCycleOne {
    public static void main(String[] args) {
        System.out.println("Программа для вычисления факториала от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число => ");
        int factor = scanner.nextInt();
        if (factor> 1 && factor <=10){
            System.out.println("Факториал числа " + factor + " = " + factorial(factor));
        } else {
            System.out.println("Вы ввели значение не в пределах указанного диапазона");
        }


    }
    static int factorial(int factor){
        int i=1;
        int result = 1;
        while (i<=factor){
            result = result *i;
            i++;
        }
        return result;
    }
}
