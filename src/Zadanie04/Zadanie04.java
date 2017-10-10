package Zadanie04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie04 {


    public static void main(String[] args) throws IOException {


        String loadedFile = null;
        String line = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
        while ((line = bufferedReader.readLine()) != null) {

            loadedFile = loadedFile + line;
        }
        String[] array = loadedFile.split(" ");
        System.out.println("Znalazlem słow: ");
        System.out.println(array.length);
        int count = 0;

        for (String word : array) {
            count += word.length();

        }
        System.out.println("Znalazlem znakow: " + count);
        System.out.println();
        System.out.println("Czarnych znakow:"+(count-array.length));
    }


}
