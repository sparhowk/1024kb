package tydzien02.zad04.task01;

// Napisz klasę Car – która będzie zawierała w sobie pola marka samochodu oraz kolor.
// Stwórz dwie klasy: ElectricCar (zawiera pole, gdzie jest przechowywana pojemność baterii samochodu)
// oraz FuelCar – gdzie przechowywana jest ilość litrów paliwa.
// Zwracam uwage, że obie te klasy powinny dziedziczyć po klasie Car.
// Stwórz w nich metodę getInfo(), która będzie zwracała Stringa wraz z podstawowymi informacjami
// o danym samochodzie.
// W main stwórz obiekt elektrycznego i spalinowego samochodu i wyświetl podstawowe jego informację.

public class Car {
    String brandCar;
    String color;

    public Car(String brandCar, String color) {
        this.brandCar = brandCar;
        this.color = color;
    }
}





