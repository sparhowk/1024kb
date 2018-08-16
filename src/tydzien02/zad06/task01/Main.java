package tydzien02.zad06.task01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Azor","Mieszaniec");

        System.out.println("Imię psa: " + dog.getName());
        System.out.println("Rasa psa: " + dog.getBreed());

        dog.setName("Pimpek");
        System.out.println("Imię psa po zmianie: " + dog.getName());

        System.out.println(dog.toString());
    }


}
