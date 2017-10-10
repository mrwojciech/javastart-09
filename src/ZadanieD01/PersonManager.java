package ZadanieD01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager {

    Person person = new Person();


    public Person createPersonFromKeyboardInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");

        boolean isFirstNameCorrect = false;
        while (!isFirstNameCorrect) {

            try {
                person.setFirstName(scanner.nextLine());
                isFirstNameCorrect = true;
            } catch (NameUndefiniedException e) {

                e.printStackTrace();
                System.out.println("Podaj poprawne imie:");
            }
        }
        System.out.println("Podaj nazwisko: ");
        person.setLastName(scanner.nextLine());
        System.out.println("Podaj wiek: ");

        boolean isAgeCorrect = false;
        while (!isAgeCorrect) {

            try {
                person.setAge(scanner.nextInt());
                isAgeCorrect = true;
            } catch (IncorrectAgeException e) {
                e.printStackTrace();
                System.out.println("Podaj poprawny wiek: ");
            } catch (InputMismatchException e) {
                e.printStackTrace();
                scanner.nextLine();
                System.out.println("Wiek musi byc liczbę");
            }
        }
        scanner.nextLine();
        System.out.println("Podaj pesel: ");
        person.setPesel(scanner.nextLine());
        return person;
    }

}
