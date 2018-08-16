package tydzien02.zad03.task01;

// Stwórz klasę NumberService – będzie ona odpowiedzialna za operację na liczbach, które będą zapisane w polu klasy
// w tablicy – tak samo jak w lekcji Userzy.
// Tablica wygląda tak: int [] numbers = {10, 2, 3, 85, 23, 491, 23, 412, 42, 41, 22, 25};
// Napisz następujące metody w klasie:
//
//        getCountNumbers() – zwracająca liczbę liczb
//        countNumbersHigherThan(int number) – zwraca ilość liczb większy od podanej jako argument
//        countNumbersLowerThan(int number) – zwraca ilość liczb mniejszych od podanej jako argument
//        sumNumbers() – zwraca sumę liczb
//        sortNumbers() – sortuje liczby
//        displayNumbers() – wyświetla wszystkie liczby


public class NumberService {
    int [] numbers = {10, 2, 3, 85, 23, 491, 23, 412, 42, 41, 22, 25};

    public int getCountNumber() {
        System.out.println("Ilość liczb w zbiorze jest równa: " + numbers.length);
        return numbers.length;
    }

    public int countNumbersHigherThan(int number) {
        int countNumberHiger = 0;
        for ( int loopNumber: numbers ) {
            if (loopNumber > number) countNumberHiger++;
        }
        System.out.println("Ilość liczb większych od " + number + " jest: " + countNumberHiger);
        return countNumberHiger;
    }

    public int countNumberLowerThan(int number) {
        int countNumberLower = 0;
        for ( int loopNumber: numbers ) {
            if ( loopNumber < number ) countNumberLower++;
        }
        System.out.println("Ilość liczb mniejszych od " + number + " jest: " + countNumberLower);
        return countNumberLower;
    }

    public void sortNumbers() {
        int tmpNumber;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tmpNumber = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmpNumber;
                }
            }
        }
    }

    public int sumNumbers(){
        int sumNumbers = 0;
        for ( int numer: numbers ) {
            sumNumbers += numer;
        }
        System.out.println("Suma wszystkich liczb  wynosi: " + sumNumbers);
        return sumNumbers;
    }

    public void displayNumbers() {
        for ( int number: numbers ) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
