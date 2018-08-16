package tydzien02.zad06.task02;

public class Main {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Adam", "Kujawiak", 35, "Latanie");

        System.out.println(superHero.getFirstName() + " " + superHero.getLastName() + " " + superHero.getAge() + " " + superHero.superPower);
    }
}
