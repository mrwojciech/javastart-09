package ZadanieD01;

public class Person {

    private String firstName, lastName, pesel;
    private int age;


    public Person(String firstName, String lastName, String pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public Person() {


    }

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) throws NameUndefiniedException {


        if ((firstName == null)) {
            throw new NameUndefiniedException("Imie nie moze byc nulem.");
        } else if (firstName.length() < 3) {
            throw new NameUndefiniedException("Imie nie moze miec mniej niz 3 znaki");
        }

        this.firstName = firstName;
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {

        if (age < 1) throw new IncorrectAgeException("Wiek nie moze byc mniejszy od 1");
        this.age = age;
    }


    @Override
    public String toString() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ",wiek: " + age + ", pesel: " + pesel;
    }
}
