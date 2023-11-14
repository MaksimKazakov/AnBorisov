import java.util.Scanner;

public class HomeWorkFifth {
    public static void main(String[] args) {
        System.out.print("Введите четырёхзначное число => ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Сумма первых двух и последних двух чисел = " + getSum(number));
    }

    static int getSum(int number) {
        return number / 100 + number % 100;
    }
}
