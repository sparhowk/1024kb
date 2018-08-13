package tydzien01.zad04;

import java.util.Scanner;

public class zad02 {
    public static void main(String[] args) {
        String name;
        String surnme;
        short age;
        short height;
        float weightF;
        String weightS;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoie imię: ");
        name = scanner.next();
        System.out.print("Podaj swoje nazwisko: ");
        surnme = scanner.next();
        System.out.print("Podaj swoj wiek: ");
        age = scanner.nextShort();
        System.out.print("Podaj swoj wzrost: ");
        height = scanner.nextShort();
        System.out.print("Podaj swoją wagę: ");
        weightF = scanner.nextFloat();
        weightS = String.format("%.1f", weightF);

        System.out.println("Nazywasz się " + name + " " + surnme + ", masz " + age + " lat, masz " + height + " cm wzrostu oraz ważysz " + weightS + " kg.");
    }
}
