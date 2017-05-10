package Fibonacci;

import java.util.Scanner;

/**
 * Created by Kamil on 2016-08-19.
 */
public class Main {
    static Scanner wczytaj = new Scanner(System.in);

    private static Integer getUserInput() {
        return Integer.valueOf(wczytaj.nextLine());
    }

    private static long licz(long miejsce) {
        System.out.print("Podaj wyraz ciągu Fibonacciego ");
        miejsce = getUserInput();
        long suma = 0;
        long liczba1 = 0;
        long liczba2 = 1;


        if (miejsce >= 0) {
            if (miejsce == 0) {
                suma = 0;
            } else if (miejsce == 1) {
                suma = 1;
            } else if (miejsce == 2) {
                suma = 1;
            } else {
                for (int i = 2; i <= miejsce; i++) {
                    suma = liczba1 + liczba2;
                    liczba1 = liczba2;
                    liczba2 = suma;
                }
            }
            System.out.println("Dla " + miejsce + " miejsca ciągu Fibonacciego wynikiem jest liczba: " + suma);

        } else {
            System.out.println(" !!! Wyraz ciągu nie może być ujemny !!!");
        }

        return suma;
    }


    public static void main(String args[]) {


        licz(0);


    }
}

