package tydzien01.zad04;

import java.util.Scanner;

public class zad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText;

        System.out.print("Podaj dowolny tekst : ");
        inputText = scanner.nextLine();

        System.out.println("Twój tekst to : " + inputText);

    }
}
