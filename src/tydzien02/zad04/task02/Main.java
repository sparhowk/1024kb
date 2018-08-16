package tydzien02.zad04.task02;

// Stwórz klasę Fruit – która będzie zawierała w nazwę owoca oraz metodę getName() zwracającą nazwę owoca.
// Stwórz klasy odpowiedzialne za reprezentację konkretnego owoca: Apple, Pinneapple, Strawberry – które
// będą dziedziczyć po klasie Fruit. Stwórz trzy obiekty w main, dodaj je wszystkie do tablicy i wyświetl
// ich nazwę przy użyciu pętli foreach.

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Jonagold");
        Apple apple1 = new Apple("Szamopin");

        Fruit [] fruits = {apple, apple1};

        for (Fruit fruit: fruits ) {
            System.out.println(fruit.getName());
        }
    }




}
