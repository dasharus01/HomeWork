package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long n0 = 0;
        long n1 = 1;
        long F = 0;
        for (int i = 2; i <= number; i++){
            F = n0 + n1;
            n0 = n1;
            n1 = F;
        }
        System.out.println(F);
    }
}
