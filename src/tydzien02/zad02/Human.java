package tydzien02.zad02;

//Stwórz klasę Human, z konstruktorem parametrowym inicjalizującym następujące pola: name, lastname, age, height, weight.

public class Human {
    String name;
    String lastname;
    int age;
    int height;
    int weight;

    public Human(String name, String lastname, int age, int height, int weight) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
