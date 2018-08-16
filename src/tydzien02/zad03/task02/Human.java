package tydzien02.zad03.task02;

// Stwórz klasę Human – w której będziesz przechowywał imię, wzrost i wagę
// – inicjalizowane przez konstruktor parametrowy.

public class Human {
    String firstName;
    String lastName;
    int height;
    int weight;

    public Human(String firstName, String lastName, int height, int weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }
}
