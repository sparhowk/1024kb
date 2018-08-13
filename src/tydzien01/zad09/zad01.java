package tydzien01.zad09;

//Mając tablicę int [] values = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5}
// znajdź jej największą i najmniejszą wartość i wypisz je na ekran konsoli.

public class zad01 {
    public static void main(String[] args) {
        int [] values = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5};
        int valueMax = 0;
        int valueMin = 0;

        for (int value: values) {
            if (value>valueMax) {
                valueMax = value;
            }
            if (value<valueMin) {
                valueMin = value;
            }
        }

        System.out.println("Największa wartość tablicy to: " + valueMax);
        System.out.println("Najmniejsza wartość tablicy to: " + valueMin);
    }
}
