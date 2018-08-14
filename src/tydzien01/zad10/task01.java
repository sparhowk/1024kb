package tydzien01.zad10;

//Stwórz funkcję, która będzie miała za zadanie wyświetlić napis: „Hello, I am {name} {lastname}”.
// Pamiętaj, że name i lastname powinny być osobnymi argumentami. Zastanów się lepiej zastosować
// funkcję void i wyświetlić automatycznie napis, czy może zwrócić zbudowanego Stringa
// i dopiero wyświetlić go w funkcji main?

import java.util.Scanner;

public class task01 {
    public static void sayHello(String name, String lastname){
        System.out.println("Hello, I am " + name + " " + lastname);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje Imię: ");
        String name = scanner.nextLine();
        System.out.print("Podaj swoje Nazwisko: ");
        String lastname = scanner.nextLine();
        sayHello(name, lastname);
    }
}
