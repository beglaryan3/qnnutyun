package service;

import model.Airport;

import java.util.Scanner;

public class AirportService {
    public  void task1(Airport plan){
        if(plan != null){
            System.out.println("Model :" + plan.getModel());
            System.out.println("Country :" + plan.getCountry());
            System.out.println("Year :" + plan.getYear());
            System.out.println("Hours :" + plan.getHours() +  "hours");
            System.out.println("isMilitary :"+ (plan.isMilitary()? "Yes" : "No"));
            System.out.println("Weight :" + plan.getWeight() + " kg");
            System.out.println("Wingspan :" + plan.getWingspan());
            System.out.println("TopSpeed :" + plan.getTopSpeed());
            System.out.println("Seats :" + plan.getSeats());
            System.out.println("Cost :" + plan.getCost() + "$");
            System.out.println("-----------------------------------------------------");
        }
    }
    public Airport createPlane(){
        Airport plan = new Airport();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model");
        plan.setModel(scanner.nextLine());
        System.out.println("Enter Country");
        plan.setCountry(scanner.nextLine());
        System.out.println("Enter Year");
        plan.setYear(scanner.nextInt());
        System.out.println("Enter Hours");
        plan.setHours(scanner.nextInt());
        System.out.println("isMilitary or no");
        plan.setMilitary(scanner.nextBoolean());
        System.out.println("Enter Weight");
        plan.setWeight(scanner.nextInt());
        System.out.println("Enter Wingspan");
        plan.setWingspan(scanner.nextInt());
        System.out.println("Enter TopSpeed");
        plan.setTopSpeed(scanner.nextInt());
        System.out.println("Enter Seats");
        plan.setSeats(scanner.nextInt());
        System.out.println("Enter Cost");
        plan.setCost(scanner.nextDouble());


        return plan;
    }

    public  void  task2(Airport plan){
        if(plan != null){
            if(plan.isMilitary()){
                System.out.println(plan.getCost() + " " + plan.getTopSpeed());
            }else{
                System.out.println(plan.getModel() + " " + plan.getCountry());
            }
        }
    }
    public  Airport task3(Airport plan1,Airport plan2){
//        if(plan1 != null && plan2 != null){
            if(plan1.getYear() > plan2.getYear()){
                return plan1;
            } else if (plan2.getYear() > plan1.getYear()) {
                return plan2;
            }else {
                return plan1;
            }
//        }
    }

    public String task4(Airport plan1, Airport plan2){
        if(plan1 != null && plan2 != null) {
            if (plan1.getWingspan() > plan2.getWingspan()) {
                return plan1.getModel();
            } else if (plan2.getWingspan() > plan1.getWingspan()) {
                return  plan2.getModel();
            }
        }
        return "";
    }

    public  void  task5(Airport plan1, Airport plan2,Airport plan3){
        if(plan1 != null && plan2 != null && plan3 != null){
            if(plan1.getSeats() < plan2.getSeats() && plan1.getSeats() < plan3.getSeats()){
                System.out.println(plan1.getCountry());
            } else if (plan2.getSeats() < plan1.getSeats() && plan2.getSeats() < plan3.getSeats()) {
                System.out.println(plan2.getCountry());
            } else if (plan3.getSeats() < plan1.getSeats() && plan3.getSeats() < plan2.getSeats()) {
                System.out.println(plan3.getCountry());
            } else if (plan1.getSeats() == plan2.getSeats() && plan2.getSeats() == plan3.getSeats()) {
                System.out.println(plan1.getCountry());
            }
        }
    }

    public  void task6(Airport [] planes){
        int count = 0;
        for (Airport plan:planes){
            if(plan != null && plan.isMilitary()){
                task1(plan);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Militry plan chka)");
        }
    }

    public  void  task7(Airport [] planes){
        int count = 0;
        for (Airport plan:planes){
            if(plan.isMilitary() && plan.getHours() > 100){
                task1(plan);
                count++;
            }
        }
        if(count == 0 ) System.out.println("There  is not plan like this");
    }

    public Airport task8(Airport [] planes){
        Airport planeWhitMinimalWeigth = null;
        for (Airport plan:planes){
            if(planeWhitMinimalWeigth == null && plan != null){
                planeWhitMinimalWeigth = plan;
            }else if(plan != null && plan.getWeight() <= planeWhitMinimalWeigth.getWeight()){
                planeWhitMinimalWeigth = plan;
            }
        }

        return planeWhitMinimalWeigth;
    }


    public  Airport task9(Airport [] planes){
        Airport minimalCostPlains = null;

        for (Airport plan:planes){
            if(plan != null && plan.isMilitary() && minimalCostPlains == null){
                minimalCostPlains=plan;
            } else if (plan != null && plan.getCost() < minimalCostPlains.getCost()) {
                minimalCostPlains = plan;
            }
        }
        return  minimalCostPlains;

       
    }


    public  void  task10(Airport [] planes){
        int count = 0;
        for (Airport plan:planes){
            if(plan != null) count++;
        }

        Airport [] sortPlanes = new Airport[count];
        for (int i = 0,j=0;i < planes.length; i++) {
            if(planes[i] != null){
                sortPlanes[j] = planes[i];
                j++;
            }
        }
        for (int i = 0; i < sortPlanes.length; i++) {
            for (int j = 0; j < sortPlanes.length; j++) {
                if(sortPlanes[i].getYear() > sortPlanes[j].getYear()){
                    Airport newPlan = sortPlanes[j];
                    sortPlanes[j] = sortPlanes[i];
                    sortPlanes[i] = newPlan;
                }
            }
        }


    }







}
