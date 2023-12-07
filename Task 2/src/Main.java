import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        check();
    }

    private static void check() {
        if ((inputNum() & 2) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static int inputNum() {
        System.out.println("Введите целое число:");
        return new Scanner(System.in).nextInt();
    }
}
