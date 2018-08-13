package tydzien01.zad04;
// Wczytaj dwie liczby całkowite od użytkownika, a następnie wyświetl wynik dodawania i odejmowania
// przy użyciu operatorów + i – np. wynik = liczbaA + liczbaB, wynik = liczbaA – liczbaB.


import java.util.Scanner;

public class zad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA;
        int numberB;
        int resultValueSub;
        int resultValueAdd;

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        numberA = scanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        numberB = scanner.nextInt();

        resultValueAdd = numberA + numberB;
        resultValueSub = numberA - numberB;

        System.out.println("Wynik dodawnia liczby " + numberA + " oraz liczby " + numberB + " wynosi : " + resultValueAdd);
        System.out.println("Wynik odejmowania liczby " + numberA + " oraz liczby " + numberB + " wynosi : " + resultValueSub);

    }
}
