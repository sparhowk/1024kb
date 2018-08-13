package tydzien01.zad09;

// Stwórz tablicę dwuwymiarową int [][] sumValues = new int[3][3] i pozwól użytkownikowi
// na wypełnienie jej każdej komórki. Po wypełnieniu całej tablicy wylicz sumę wierszy
// – bez różnicy czy pierwszy index weźmiesz za kolumnę czy wiersz – chodzi o to, aby
// wynikiem działania programu były trzy sumy wierszy.

import java.util.Scanner;

public class zad02 {
    public static void main(String[] args) {
        int [][] sumValues = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < sumValues.length; i++) {
            for (int j = 0; j < sumValues.length; j++) {
                System.out.print("Podaj liczbę dla komórki [" + i + "][" + j + "]: ");
                sumValues[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < sumValues.length; i++){
            int sum = 0;
            for (int j = 0; j < sumValues.length; j++) {
                sum += sumValues[i][j];
            }
            System.out.println("Wynik sumy " + ( i+1 ) + "-go wiersza to: " + sum);
        }
    }
}
