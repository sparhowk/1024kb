package tydzien02.zad04.task01;

public class FuelCar extends Car {
    int fuelCapacility;

    FuelCar(String brandCar, String color, int fuelCapacility) {
        super(brandCar, color);
        this.fuelCapacility = fuelCapacility;
    }

    public void getInfo() {
        System.out.println(brandCar + " " + color + " " + fuelCapacility);
    }
}
