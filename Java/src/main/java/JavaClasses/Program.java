package JavaClasses;

import java.awt.Color;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Program {
    private Scanner scanner;
    private List<Cars> cars;
    private Search search;

    public  Program(List<Cars> cars) {
        this.cars = cars;
        this.search=new Search();
        this.scanner = new Scanner(System.in);
    }
    public void run() {
        System.out.println("Консольное приложение \"Автомобили\": ");
        while (true){
            menu();
        }
    }
    private void menu() {
        menuItems();
        int value = scanner.nextInt();
        switch (value){
            case 1: {
                System.out.println("Введите марку автомобиля: ");
                String make=scanner.next().toUpperCase();
                methodGetCarsByMake(make);
                break;
            }
            case 2:{
                System.out.println("Введите модель автомобиля: ");
                String model=scanner.next().toUpperCase();
                System.out.println("Введите количество лет эксплуатации: ");
                int year=scanner.nextInt();
                methodGetCarsByModelAndYear(model,year);
                break;
            }
            case 3:{
                System.out.println("Введите год выпуска автомобиля: ");
                int year=scanner.nextInt();
                System.out.println("Введите цену автомобиля: ");
                int price=scanner.nextInt();
                methodGetCarsByYearAndPrice(year,price);
                break;
            }
            case 4:{
                System.out.println("Спасибо за использование программы. Завершение работы.");
                System.exit(0);
            }
            default:{
                System.out.println("Вы ввели неверную операцию!");
            }
        }
    }
    private void methodGetCarsByMake(String make ) {
        System.out.println("Список автомобилей марки <"+make+">:");
        List<Cars> list = search.getCarsByMake(cars, Make.valueOf(make));
        for (Cars car : list)
            System.out.println(car.toString());

    }
    private void methodGetCarsByModelAndYear(String model,Integer year) {
        System.out.println("Выборка авто модели <"+model+"> и сроком эксплуатации больше "+year+" лет:");
        List<Cars> list = search.getCarsByModelAndOperation(cars, model, year);
        for (Cars car : list)
            System.out.println(car.toString());

    }
    private void methodGetCarsByYearAndPrice(Integer year,Integer price) {
        System.out.println("Выборка авто с годом выпуска <"+year+"> и ценой больше "+price+" :");
        List<Cars> list = search.getCarsByYearAndPrice(cars, year, price);
        for (Cars car : list)
            System.out.println(car.toString());
    }
    private void menuItems() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Пожалуйста, введите номер операции: ");
        System.out.println("1 - Вывести список автомобилей заданной марки");
        System.out.println("2 - Вывести список автомобилей заданной модели, которые эксплуатируются больше n лет");
        System.out.println("3 - Вывести список автомобилей заданного года выпуска, цена которых больше указанной");
        System.out.println("4 - Выход");
    }
    }
