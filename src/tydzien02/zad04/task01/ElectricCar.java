package tydzien02.zad04.task01;

public class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brandCar, String color, int batteryCapacity) {
        super(brandCar, color);
        this.batteryCapacity = batteryCapacity;
    }

    public void getInfo() {
        System.out.println(ElectricCar.this.brandCar + " " +  ElectricCar.this.color + " " +  ElectricCar.this.batteryCapacity);
    }
}
