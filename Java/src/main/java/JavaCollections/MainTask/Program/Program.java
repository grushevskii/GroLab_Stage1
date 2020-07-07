package JavaCollections.MainTask.Program;

import JavaCollections.MainTask.Aircraft.Config.AircraftConfig;
import JavaCollections.MainTask.Aircraft.Config.Models.*;
import JavaCollections.MainTask.Airline.Airline;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AircraftConfig airbusA300 = new AirbusA300();
        AircraftConfig bombardierCRJ200  = new BombardierCRJ200();
        AircraftConfig embraerE195 = new EmbraerE195();
        AircraftConfig boeing737 = new Boeing737NG();
        AircraftConfig sukhoiSuperjet=new SukhoiSuperjet();
        Airline belarusInternationalAirline = new Airline("Belarusian International Airlines");
        belarusInternationalAirline.addAircraft(airbusA300);
        belarusInternationalAirline.addAircraft(bombardierCRJ200);
        belarusInternationalAirline.addAircraft(embraerE195);
        belarusInternationalAirline.addAircraft(boeing737);
        belarusInternationalAirline.addAircraft(sukhoiSuperjet);
        int value;
        do {
            System.out.println("Консольное приложение \"Авиакомпания\" ");
            System.out.println("1 - Вывести список самолетов авиакомпании ");
            System.out.println("2 - Сортировка самолетов компании по дальности полета ");
            System.out.println("3 - Подсчет общей вместимости и грузоподъемности самолетов ");
            System.out.println("4 - Поиск самолетов авиакомпании, соответствующих заданному диапазону параметров потребления горючего ");
            System.out.println("5 - Выход ");
            System.out.println("Введите номер операции: ");
            value=scanner.nextInt();
            switch (value) {
                case 1:{
                    belarusInternationalAirline.showAirlineAircrafts();close();
                    break;}
                case 2: {
                    System.out.println("Сортировка самолетов компании по дальности полета: ");
                    belarusInternationalAirline.sortPlanesByFlightRange();
                    belarusInternationalAirline.showAirlineAircrafts();
                    close();
                    break;
                }
                case 3:
                    belarusInternationalAirline.calculateTotalCargoPassengerCapacity();close();
                    break;
                case 4: {
                    System.out.println("Введите минимальное количество потребления горючего: ");
                    int min=scanner.nextInt();
                    System.out.println("Введите максимальное количество потребления горючего: ");
                    int max=scanner.nextInt();
                    belarusInternationalAirline.filterAircraftsByFuelConsumption(min, max, true);
                    close();
                    break;
                }
                case 5: break;
                default:
                    System.out.println("Указана неверная операция! ");close();
                    break;
            }

        }while (value!=5);
        }
        public static void close(){
            System.out.println("====================================");
            System.out.print("Press any key to continue...");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
