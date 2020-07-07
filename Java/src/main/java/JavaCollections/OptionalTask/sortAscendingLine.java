package JavaCollections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sortAscendingLine {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./src/main/resources/collections/poem.txt"));
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        scanner.close();
        Collections.sort(list,LINE_LENGTH);
        System.out.println("Сортировка строк стихотворения по возрастанию их длины: ");
        for (String line : list) {
            System.out.println(line);
        }
    }
    private static final Comparator<String> LINE_LENGTH = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };
}
