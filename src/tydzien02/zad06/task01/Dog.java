package tydzien02.zad06.task01;

// Stwórz klasę Dog z prywatnymi polami: imię oraz rasa psa. Zastanów się, dla których stworzyć
// gettery i settery – myślę, że imię psa można jeszcze zmienić, lecz rasę… 😉
// Dla klasy zdefiniuj także toString() – dzięki, której wyświetlisz informację o obiekcie w konsoli.

public class Dog {
    private String name;
    private String breef;

    public Dog (String name, String breef) {
        this.name = name;
        this.breef = breef;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breef;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Dog{" +
                "name='" + name + '\'' +
                ", breef='" + breef + '\'' +
                '}';
    }
}
