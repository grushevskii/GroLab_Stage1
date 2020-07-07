package JavaCollections.OptionalTask;

import java.util.Scanner;
import java.util.Stack;

public class stackToNumber {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Введите число: ");
StringBuffer buffer=new StringBuffer(scanner.nextLine());
Stack<StringBuffer> strings = new Stack<>();
            strings.push(buffer.reverse());
        System.out.println("Число с цифрами в обратном порядке:");
        System.out.println(strings.pop());
} }
