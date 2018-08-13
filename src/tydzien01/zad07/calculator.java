package tydzien01.zad07;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int valueA;
        int valueB;
        float result;
        int operation;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        valueA = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        valueB = scanner.nextInt();
        System.out.println("Jakie działanie chcesz wykonać: ");
        System.out.println("Dodawanie - 1");
        System.out.println("Odejmowanie - 2");
        System.out.println("Mnożenie - 3");
        System.out.println("Dzielenie - 4");


        operation = scanner.nextInt();

        switch (operation){
            case 1:
                System.out.println("Wynik dodawnia: " + (valueA + valueB));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + (valueA + valueB));
                break;
            case 3:
                System.out.println("Wynik mnożenia: " + (valueA + valueB));
                break;
            case 4:
                result = (float)valueA / (float)valueB;
                System.out.println("Wynik dzielenia: " + result);
                break;
            default:
                System.out.println("Nie znam tej operacji");
        }

    }
}
