package tydzien02.zad04.task01;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla 125p","red",1258);
        FuelCar fuelCar = new FuelCar("Ford", "black", 60);

        electricCar.getInfo();
    }
}
