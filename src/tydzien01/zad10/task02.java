package tydzien01.zad10;

// Stwórz funkcję, która w tablicy podanej jako argument znajdzie element najmniejszy i go zwróci.
// Stwórz funkcję, która w tablicy podanej jako argument znajdzie element największy i go zwróci.

public class task02 {
    public static int searchMin(int [] numbers) {
        int min=0;
        for (int i = 0; i < numbers.length; i++) {
            if (i==0) min = numbers[i];
            if ( min > numbers[i]) min = numbers[i];
        }
        return min;
    }

    public static int searchMax(int [] numbers) {
        int max=0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) max = numbers[i];
            if (max < numbers[i]) max = numbers[i];

        }
        return max;
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, -30};
        int min = searchMin(numbers);
        int max = searchMax(numbers);

        System.out.println("Najmniejsza wartość to: " + min);
        System.out.println("Największa wartość to: " + max);
    }
}
