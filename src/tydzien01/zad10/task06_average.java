package tydzien01.zad10;

//Stwórz funkcję, która obliczy średnią wszystkich elementów tablicy podanej jako argument.

public class task06_average {
    public static float averageNumbers(int [] numbers) {
        float average = 0;
        float sum =0;
        for (float number: numbers) {
            sum += number;
        }
        average = sum / (float) numbers.length;
        return average;
    }

    public static void main(String[] args) {
        int [] numbers = {1,34,56,33,12,-90,-2,1};
        float avg = averageNumbers(numbers);
        System.out.println("Srednia wartość elementów tablicy to: " + avg);
    }

}
