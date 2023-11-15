/*
* Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семеркой
и вернуть boolean значение.
*/
package ConditionalStatements_02;
import java.util.Scanner;
public class HomeWorkCSOne {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Программа определяет, равна ли последняя цифра введённого числа 7.\nВведите число => ");
        int number = scaner.nextInt();
        System.out.println(isNumberSeven(number));
    }
    static boolean isNumberSeven(int number) {
        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}
