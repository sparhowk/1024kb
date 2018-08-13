package tydzien01.zad09;

//Przy użyciu pętli nieskończonej stwórz menu dla kalkulatora,
// w którym  można wybrać opcję dodawania/odejmowania/mnożenia/dzielenia –
// po użyciu wybranej funkcji menu powinno na nowo się wyświetlić,
// a użytkownik powinien nadal móc używać kalkulatora.

import java.util.Scanner;

public class zad03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = true;



        while (exit) {
            System.out.println("Wybierz odpowienią opcje z menu :");
            System.out.println("        Dla dodawnia naciśnij - 1");
            System.out.println("        Dla odejmowania naciśnij - 2");
            System.out.println("        Dla mnożenia naciśnij - 3");
            System.out.println("        Dla dzielenia naciśnij - 4");
            System.out.println("    Aby wyjść naciśnij - 0");
            System.out.print("Wybierasz: ");
            int status = scanner.nextInt();

            switch (status) {
                case 1:
                    System.out.println("Wybrałeś dodawanie : BRAWO !");
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowania : BRAWO !");
                    break;
                case 3:
                    System.out.println("Wybrałeś mnożenie : BRAWO !");
                    break;
                case 4:
                    System.out.println("Wybrałeś dzielenie : BRAWO !");
                    break;
                case 0:
                    System.out.println("Wychodzimy");
                    exit = false;
                    break;
                default:
                    System.out.println("Nie znam tej opcji");
            }



        }
    }
}
