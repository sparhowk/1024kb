package tydzien02.zad03.task01;

public class Main {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        System.out.print("Zbór liczb to: ");
        numberService.displayNumbers();
        numberService.getCountNumber();
        numberService.countNumbersHigherThan(100);
        numberService.countNumberLowerThan(20);
        numberService.sortNumbers();
        numberService.sumNumbers();
        System.out.print("Zbór po sortowaniu : ");
        numberService.displayNumbers();
    }
}
