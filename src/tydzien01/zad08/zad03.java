package tydzien01.zad08;

//Zainicjalizuj tablicę dwuwymiarową 3×3, wypełnij ją całą liczbami
// i na koniec wyświetl sumę wszystkich liczb na ekran konsoli.

public class zad03 {
    public static void main(String[] args) {
        int [][] tab = {{1,2,3},{1,2,3},{1,2,3}};

        int sum = tab[0][0]+tab[0][1]+tab[0][2]
                 +tab[1][0]+tab[1][1]+tab[1][2]
                 +tab[2][0]+tab[2][1]+tab[2][2];
        System.out.println(sum);
    }
}
