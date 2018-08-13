package tydzien01.zad08;

//Stwórz tablicę na 3 imiona, którą wypełnisz imionami podanymi przez użytkownika.
// Na koniec wyświetl je wszystkie.

import java.util.Scanner;

public class zad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] name = new String[3];

        System.out.println("Podaj trzy dowolne imiona.");

        for (int i = 0; i < name.length; i++) {
            System.out.print("Podaj " + (i + 1) + " imię: ");
            name[i] = scanner.nextLine();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
