package ZadanieD02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadanieD022 {
    static boolean isSavePossible = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int size = getArraySize();
        double[] array = createArray(size);
        fillArray(array);
        saveArrayToFile(array);

    }

    private static void saveArrayToFile(double[] array) {
        if (isSavePossible) {
            System.out.println("Zapisuje do pliku");
            for (double d : array) {
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

    private static void fillArray(double[] array) {
        int size = array.length;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element " + (int) (i + 1) + ": ");
            try {
                array[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                e.getStackTrace();
                scanner.nextLine();
                System.out.println("Nie podales liczy calkowitej. wychodze z programu!");
                isSavePossible = false;
                break;
            }
        }


    }

    private static double[] createArray(int size) {
        return new double[size];
    }

    public static int getArraySize() {
        int size = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj wielkosc tablicy: ");
            size = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.out.println("Nie podałeś liczby. Kończę program!");
            isSavePossible = false;
        }
        return size;
    }
}
