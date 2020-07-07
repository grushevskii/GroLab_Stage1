package JavaFundamentals;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class MainTask {
    private static    String[] month = {"январь", "феваль", "март", "апрель", "май", "июнь",
            "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greetUser();
        displayReverseOrder(args);
        printRandomNumbers();
        sumOfIntegers(args);
        displayMonthName();
    }

    static void greetUser() {
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    static void displayReverseOrder(String[] args) {
        if(args.length==0) {System.out.println("Аргументы командной строки отсутствуют!");
        exit(0);}
        System.out.println("Аргументы командной строки в обратном порядке:");
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.print(args[i]);

    }
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void printRandomNumbers() {
        System.out.println();
        System.out.print("Введите количество случайных чисел: ");
        int value = scanner.nextInt();
        int[] randomArray = new int[value];
        for (int i=0;i<randomArray.length;i++) {
            randomArray[i] = new Random().nextInt(10);
        }
        System.out.println("Массив случайных чисел без перехода на новую строку: ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        System.out.println("Массив случайных чисел с переходом на новую строку: ");
         for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
    }
    //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения)
    // и вывести результат на консоль.
    public static void sumOfIntegers(String[] args){
        int  sum = 0;
        int composition=1;
        for (String arg : args) {
            sum += Integer.valueOf(arg);
            composition *=Integer.valueOf(arg);
        }
        System.out.println("Сумма аргументов командной строки: "+sum);
        System.out.println("Произведение аргументов командной строки: "+composition);
    }
    public static void displayMonthName(){
        System.out.println("Введите номер месяца: ");
        if(!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Аргумент не является числом");
        }
        System.out.println("Это месяц: "+verificationMonthName(scanner.nextInt()));
        }
    public static String verificationMonthName(int numberMonth) {
        if (!verificationMonth(numberMonth)) {
            throw new IllegalArgumentException("Введен некорректный номер месяца");
        }
        return month[numberMonth-1];
    }
    public static boolean verificationMonth(int numberMonth) {
        if (numberMonth>= 1 && numberMonth <= 12) {
            return true;
        }else {
            return false;
        }
    }
    }

