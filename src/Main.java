import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет это калькулятор по таблице умножения и я решу любой сложный пример, введи  первое число!");
        int num1 = scan.nextInt();
        System.out.println("веди второе число");
        int num2 = scan.nextInt();
        var res = num1 * num2;
        var res1 = num1 / num2;
        var res2 = num1 + num2;
        var res3 = num1 - num2;

        System.out.println("ответ " + res);
        System.out.println("ответ " + res1);
        System.out.println("ответ " + res2);
        System.out.println("ответ " + res3);
        System.out.println("ответ " + res3);
        System.out.println("ответ " + res3);
    }
}