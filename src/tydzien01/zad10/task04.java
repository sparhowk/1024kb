package tydzien01.zad10;

//Stwórz funkcję, która wyświetli wszystkie elementy tablicy podanej jako argument funkcji.

public class task04 {
    public static void viewElements(int [] numbers) {
        System.out.print("Liczby to: ");
        for (int number: numbers) {
            System.out.print(number + ", ");
        }
    }
    public static void main(String[] args) {
        int [] numbers = {1,34,56,33,12,-90,-2,1};
        viewElements(numbers);
    }
}
