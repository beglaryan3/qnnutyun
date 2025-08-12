import model.Airport;
import service.AirportService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        AirportService airportService = new AirportService();


        boolean isActive = true;
        Airport [] planes = new Airport[5];
        while (isActive) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("For task1 enter 1");
            System.out.println("For task1 enter 2");
            System.out.println("For task1 enter 3");
            System.out.println("For task1 enter 4");
            System.out.println("For task1 enter 5");
            System.out.println("For task1 enter 6");
            System.out.println("For task1 enter 7");
            System.out.println("For task1 enter 8");
            System.out.println("For task1 enter 9");
            System.out.println("For task1 enter 10");

            int val = scanner.nextInt();
            switch (val) {
                case 1:
                    airportService.task1(airportService.createPlane());
                    break;
                case 2:
                    airportService.task2(airportService.createPlane());
                    break;
                case 3:
                    Airport plan1 = airportService.createPlane();
                    Airport plan2 = airportService.createPlane();
                    airportService.task3(plan1,plan2);
                    break;
                case 4:
                    Airport plan3 = airportService.createPlane();
                    Airport plan4 = airportService.createPlane();
                    airportService.task4(plan3,plan4);
                    break;
                case 5:
                    Airport plan5 = airportService.createPlane();
                    Airport plan6 = airportService.createPlane();
                    Airport plan7 = airportService.createPlane();
                    airportService.task5(plan5,plan6,plan7);
                    break;
                case 6:
                    airportService.task6(planes);
                    break;
                case 7:
                    airportService.task7(planes);
                    break;
                case 8:
                   Airport newPlan =  airportService.task8(planes);
                    if(newPlan == null){
                        System.out.println("Plan chka");
                    }
                    break;
                case 9:
                    airportService.task9(planes);
                    break;
                case 10:
                    break;
                default:
                    isActive = false;

            }
        }
    }
}
