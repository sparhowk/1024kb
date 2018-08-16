package tydzien02.zad03.task02;

public class Main {
    public static void main(String[] args) {
        HumanService humanService = new HumanService();
        System.out.println("Mamy na liście ludzi więszych niż 169 cm: " + humanService.countHumanTallerThan(169));
        System.out.println("Mamy na liście ludzi mniejszych niż 169 cm: " + humanService.countHumanLowerThan(169));
        System.out.println("Suma ich wagi wynosi: " + humanService.countWeights());
        System.out.println("Suma ich wagi wzrostu: " + humanService.countHeights());
        System.out.println("Mamy na liście ludzi: " + humanService.getCountHumans());

        String userNameToSerach = "Anna";
        Human isUserNotNull = humanService.getHumanByName(userNameToSerach);
        if (isUserNotNull != null) {
            System.out.println("Użytkownik " + userNameToSerach + "Jest w naszym systemie");
        } else
        {
            System.out.println("Użytkownik " + userNameToSerach + ", nie jest zarejstrowany");
        }
    }


}
