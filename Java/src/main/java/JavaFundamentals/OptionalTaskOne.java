package JavaFundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class OptionalTaskOne {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел будет введено? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<String> arrayNumbers = new ArrayList<>(size);
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            arrayNumbers.add(scanner.next());
        }
        findShortAndLongNumber(arrayNumbers);
        sortAscending(arrayNumbers);
        outputNumbersLengthShorterAndLongerAverageLength(arrayNumbers);
        printNumberLeastDiffDigits(arrayNumbers);
    }
    public static void findShortAndLongNumber(List<String> arrayNumbers){
        int min = 10, max = 0;
        String  minLine = null, maxLine = null;
        for (String number : arrayNumbers) {

            if (number.length() < min) {
                min = number.length();
                minLine = number;
            }
            if (number.length() > max) {
                max = number.length();
                maxLine = number;
            }
        }
        System.out.println("Минимальное число " + minLine + " состоит из " + min
                + " цифр\nМаксимальное число " + maxLine + " состоит из " + max
                + " цифр");
    }
    public static void sortAscending(List<String> arrayNumbers){
        //Здесь происходит сортировка (сортировка пузырьком):
        for(int i = arrayNumbers.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arrayNumbers.get(j).length() > arrayNumbers.get(j+1).length() ){
                    String tmp = arrayNumbers.get(j);
                    arrayNumbers.set(j,arrayNumbers.get(j+1));
                    arrayNumbers.set(j+1,tmp);
                }
            }
        }
        System.out.println("Числа в порядке возрастания значений их длины:");
        for (int i = 0; i < arrayNumbers.size(); i++){
            System.out.println(arrayNumbers.get(i));
        }
    }
    public static void outputNumbersLengthShorterAndLongerAverageLength(List<String> arrayNumbers){
        double avg = 0;
        for (String number : arrayNumbers) {
            avg += number.length();
        }
        if (arrayNumbers.size() > 0) avg /= arrayNumbers.size();
        System.out.printf("Средняя длина введенных чисел: %.2f", avg);
        System.out.println("\nЧисла с длиной больше среднего:");
        for (String number : arrayNumbers) {
            if (number.length() > avg) System.out.println(number + " Длина: " + number.length());
        }
        System.out.println("Числа с длиной меньше среднего:");
        for (String number : arrayNumbers) {
            if (number.length() < avg) System.out.println(number + " Длина: " + number.length());
        }
    }
    public static void printNumberLeastDiffDigits(List<String> arrayNumbers){
        int min = diffDigits(Integer.valueOf(arrayNumbers.get(0)));
        String minElement = arrayNumbers.get(0);

        for (int i = 1; i < arrayNumbers.size(); i++) {
            int minNumber = diffDigits(Integer.valueOf(arrayNumbers.get(i)));
            if (minNumber < min) {
                min = minNumber;
                minElement = arrayNumbers.get(i);
            }
        }
        System.out.printf("Число с минимальным количеством различных цифр: %s", minElement);
    }

    private static int diffDigits(int number) {
        HashSet<Integer> digits = new HashSet<>();
        do{
            digits.add(number % 10);
            number /= 10;
        }while (number > 0);
        System.out.println(digits.size());
        return digits.size();
    }
    }
