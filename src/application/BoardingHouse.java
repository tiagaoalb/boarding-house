package application;

import entities.Rent;

import java.util.Scanner;

public class BoardingHouse {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] rent = new Rent[10];

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();
    }
}
