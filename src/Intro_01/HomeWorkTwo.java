package Intro_01;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Результат = " + twoCalculate(a, b));

    }

    static int twoCalculate(int a, int b) {
        return (a + b) + (a * b);
    }
}

