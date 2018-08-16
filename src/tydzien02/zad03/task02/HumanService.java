package tydzien02.zad03.task02;

//    Stwórz klasę HumanService – która będzie w sobie zawierała tablicę 5 obiektów typu Human ( z zadania drugiego).
//    Na tablicy tych obiektów wykonuj operację przy użyciu metod. Stwórz te metody:
//
//    countHumanTallerThan(int height) – zwraca ilość ludzi mających większy wzrost niż podany jako argument
//    countHumanLowerThan(int height) – zwraca ilość ludzi mających mniejszy wzrost niż podany jako argument
//    countWeights() – zwraca łączną wagę wszystkich ludzi
//    countHeights() – zwraca łączny wzrost wszystkich ludzi
//    getCountHumans() – zwraca liczbę ludzi na liście
//    getHumanByName(String name) – zwraca usera, który ma tak samo na imię jak imię podane jako argument

public class HumanService {
    Human [] humans = {
            new Human("David", "Duhowny", 178, 88),
            new Human("Jarek", "Szaremij", 170, 76),
            new Human("Tomek", "Kulowy", 180, 65),
            new Human("Mirisław", "Mróz", 189, 102),
            new Human("Anna", "Woźniak", 173, 59)
    };


    public int countHumanTallerThan(int height) {
        int countHumanTallerThan = 0;
            for (Human human: humans) {
                if (human.height > height) countHumanTallerThan++;
            }
        return countHumanTallerThan;
    }

    public int countHumanLowerThan(int height) {
        int countHumanLowerTkan = 0;
        for (Human human: humans) {
            if (human.height < height) countHumanLowerTkan ++;
        }
        return countHumanLowerTkan;
    }

    public int countWeights() {
        int countWeight = 0;
        for (Human human: humans) {
            countWeight += human.weight;
        }
        return countWeight;
    }

    public int countHeights() {
        int countHeight = 0;
        for (Human human: humans) {
            countHeight += human.height;
        }
        return countHeight;
    }

    public int getCountHumans() {
        int countHumans = 0;
        for (Human human: humans) {
            if (!human.firstName.equals("")) countHumans++;
        }
        return countHumans;
    }

    public Human getHumanByName(String name) {
        for (Human human: humans) {
            boolean isUserExist = human.firstName.equals(name);
            if (isUserExist) {
                return human;
            }
        }
        return null;
    }
}