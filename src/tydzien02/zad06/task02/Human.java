package tydzien02.zad06.task02;

// Stwórz klasę Human z polami: imię, nazwisko oraz wiek, stwórz klasę SuperHero,
// która będzie dziedziczyć po Human z polem superPower. Wychodząc z założenia,
// że możemy zmienić tylko wiek człowieka i superbohatera napisz odpowiednie settery i gettery.
// Dla klas zdefiniuj także toString() – dzięki, której wyświetlisz informację o obiektach w konsoli.

public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Human{"
                + "name='" + firstName + '\''
                + ", nazwisko='" + lastName +'\''
                + "wiek='" + age + '\''
                + "}";
    }
}
