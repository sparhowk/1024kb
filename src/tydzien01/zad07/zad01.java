package tydzien01.zad07;

//Na podstawie liczby podanej od użytkownika sprawdź w jakim przedziale mieści się
// liczba: od 0 do 10, od 11 do 20, od 21 do 30, od 31 do 40 czy może 41 do 50.
// Wypisz na ekran informację o przedziale, jeżeli liczba nie mieści się w żadnym
// z nich to wyświetl informację: „Liczba nie należy do żadnego z przedziałów”.

import java.util.Scanner;

public class zad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę z przedziału od 0 do 100: ");
        int number = scanner.nextInt();

        if (number <= 10){
            System.out.println("Liczba jest z przedziału od 0 do 10.");
        } else if (number > 10 && number <= 20 ) {
            System.out.println("Liczba jest z przedziału od 11 do 20.");
        } else if (number > 20 && number <= 30 ) {
            System.out.println("Liczba jest z przedziału od 21 do 30.");
        } else if (number > 30 && number <= 40 ) {
            System.out.println("Liczba jest z przedziału od 31 do 40.");
        }  else if (number > 40 && number <= 50 ) {
            System.out.println("Liczba jest z przedziału od 41 do 50.");
        }
        else {
            System.out.println("Liczba nie należy do żadnego przedziału.");
        }


    }
}
