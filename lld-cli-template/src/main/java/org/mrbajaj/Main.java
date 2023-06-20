package org.mrbajaj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        do{
            System.out.println("Press 0 to stop, any other integer to continue.!!");
            option = sc.nextInt();
        }while(option != 0);

        System.out.println("Hello world!");
    }
}