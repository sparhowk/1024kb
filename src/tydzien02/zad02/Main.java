package tydzien02.zad02;

public class Main {
    public static void main(String[] args) {
        Engine oil = new Engine("beznzyna");
        Engine disel = new Engine("disel");

        Car carOne = new Car("Maluch", "Biłay", oil);
        Car carTwo = new Car("Skoda", "black", disel);

        System.out.println("Samochód " + carOne.brand + " ma silnik " + carOne.engine.typeEngine);
        System.out.println("Samochód " + carTwo.brand + " ma silnik " + carTwo.engine.typeEngine);
    }
}
