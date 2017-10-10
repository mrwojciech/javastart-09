package ZadanieD02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadanieD02 {

    public static void main(String[] args) {

        int size = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isSavePossible = true;
        try {
            System.out.println("Podaj wielkosc tablicy: ");
            size = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.out.println("Nie podałeś liczby. Kończę program!");
            isSavePossible = false;
        }
        double[] tab = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element " + (int) (i + 1) + ": ");
            try {
                tab[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                e.getStackTrace();
                scanner.nextLine();
                System.out.println("Nie podales liczy calkowitej. wychodze z programu!");
                isSavePossible = false;
                break;
            }
        }
        if (isSavePossible) {
            System.out.println("Zapisuje do pliku");
            for (double d : tab) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test3.txt"));) {
                    bufferedWriter.write(String.valueOf(d) + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Zapisywanie do pliku sie nie powiodlo");
                }
            }
        } else {
            System.out.println("Nie zapisuje do pliku!");
        }

    }
}
