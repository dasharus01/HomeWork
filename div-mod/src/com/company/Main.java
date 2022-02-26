package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
        if(number1 == 0 && number!=0){
            System.out.println("Деление на ноль не возможно!");
        }
        else if (number == 0 && number1!=0){
            System.out.println("частное: " + 0);
            System.out.println("остаток: " + 0);
        }
        else if (number == 0 && number1==0){
            System.out.println("Результат неопределен");
        }
        else {
            int c = 0;
            int s = 0;
            if ((number * number1) < 0) {
                s = -1;
            } else
                s = 1;
            number = Math.abs(number);
            number1 = Math.abs(number1);
            while (number >= number1) {
                number = number - number1;
                c++;
            }
            System.out.println("частное: " + s * c);
            System.out.println("остаток: " + s * number);
        }
    }
}
