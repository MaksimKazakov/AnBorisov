/*Switch
Написать метод, который выводит расписание на неделю.
Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
*/
package ConditionalStatements_02;

import java.util.Scanner;

public class HomeWorkCSThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте день недели цифрой от 1 до 7 => ");
        int day = scanner.nextInt();
        dayWeek(day);
    }
    static int dayWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник - тренировка");
                break;
            case 2:
                System.out.println("Вторник - прогулка");
                break;
            case 3:
                System.out.println("Среда - чтение");
                break;
            case 4:
                System.out.println("Четверг - плавание");
                break;
            case 5:
                System.out.println("Пятница - поход");
                break;
            case 6:
                System.out.println("Суббота - тренировка");
                break;
            case 7:
                System.out.println("Воскресенье - выходной");
                break;
            default:
                System.out.println("Дня с таким номером не существует");
        }

        return day;
    }

}
