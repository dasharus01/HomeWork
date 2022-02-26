package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int k3 = 0; //флаг для св-в деления на 3
        int k5 = 0; //флаг для св-в деления на 5
        //int k35 = 0;//то и то
        if(number%10 == 0 || number%10 == 5){
            k5++;
        }
        int sum = 0;//сумма цифр
        while(number > 0){
            sum = sum + (number%10);
            number = number/10;
        }
        if(sum%3==0){
            k3++;
        }
        if(k3 == 1 && k5 == 0){
            System.out.println("fizz");
        }
        if(k3 == 0 && k5 == 1){
            System.out.println("buzz");
        }
        if(k3 == 1 && k5 == 1){
            System.out.println("fizzbuzz");
        }
        if(k3 == 0 && k5 == 0){
            System.out.println("uuups");
        }
    }
}
