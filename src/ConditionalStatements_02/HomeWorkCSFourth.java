package ConditionalStatements_02;
import java.util.Scanner;
public class HomeWorkCSFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите, сколько у вас денег => ");
        int money = scanner.nextInt();
        System.out.printf("У вас %d %s", money, isRub(money));
    }
    static String isRub(int money) {
        int res = money % 100 / 10;
        if (res == 1)
        {
            return "рублей";
        }
        switch (money % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }
}
