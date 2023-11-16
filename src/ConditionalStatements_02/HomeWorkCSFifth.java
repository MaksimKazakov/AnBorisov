package ConditionalStatements_02;
import java.util.Scanner;
public class HomeWorkCSFifth {
    public static void main(String[] args) {
        System.out.println("Программа для решения квадратного уравнения ax2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значения a, b, c через пробел => ");
        double valueA = scanner.nextInt();
        double valueB = scanner.nextInt();
        double valueC = scanner.nextInt();
        discriminant(valueA, valueB, valueC);
    }
    static void discriminant(double valueA, double valueB, double valueC) {
        int discriminant = (int) (Math.pow(valueB, 2) - 4 * valueA * valueC);
        if (discriminant > 0) {
            double x1 = (-valueB - Math.sqrt(discriminant)) / (2 * valueA);
            double x2 = (-valueB + Math.sqrt(discriminant)) / (2 * valueA);
            System.out.printf("Корни уравнения: х1 = %.1f и x = %.1f", x1, x2);
        } else if (discriminant == 0) {
            double x = -valueB / (2 * valueA);
            System.out.printf("Уравнение имеет единственный корень: x = %f", x);
        }else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
