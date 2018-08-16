package tydzien02.zad06.task02;

public class SuperHero extends Human {
    String superPower;

    public SuperHero(String firstName, String lastName, int age, String superPower) {
        super(firstName, lastName, age);
        this.superPower = superPower;
    }

}
