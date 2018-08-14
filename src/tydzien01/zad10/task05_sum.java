package tydzien01.zad10;

//Stwórz funkcję, która obliczy sumę wszystkich elementów tablicy podanej jako argument.

public class task05_sum {
    public static int sumTab(int [] numbers){
        int sum = 0;
        for ( int number: numbers ) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] numbers = {1,34,56,33,12,-90,-2,1};
        int sum = sumTab(numbers);
        System.out.println("Suma wszystkich elemtów tablicy wynosi: " + sum);

    }
}
