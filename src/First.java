import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int i = 3;
        print("Число: " + i + " - " + isEven(i)  );


    }

    static boolean isEven(int i) {
        return (i % 2) == 0;
    }

    static void print(String str){
        System.out.println(str);
    }

}
