package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.obj.TaxiPark;
import com.epam.jwd.task1.obj.TaxiPark.ComfortTaxi;

public class LogisticCenter {

    public static int calculateCostOfTaxiPark(TaxiPark[] List) {
        int cost = 0;
        for (TaxiPark taxis: List) {
            cost += taxis.getCostOfTheModel();
        }
        return cost;
    }

    public static String findCarWithSpeed(TaxiPark[] List, int maxSpeed, int minSpeed) {
        String car = " ";
        for (TaxiPark taxis: List) {
            if (taxis.getSpeed() <= maxSpeed && taxis.getSpeed()  >= minSpeed) {
               car = taxis.getModel();
                break;
            } else {
                car = "There is no such car model";
            }
        }
        return car;
    }

    public static double findMaxFuelConsumption(TaxiPark[] List) {
        double max = List[0].getFuelConsumption();
        for (TaxiPark taxis: List) {
            if (taxis.getFuelConsumption() > max) {
                max = taxis.getFuelConsumption();
            }
        }
        return max;
    }

    public static String fuelAscendingOrder(TaxiPark[] List) {
        for (int q = 0; q < List.length; q++) {
            for (int i = 0; i < List.length - 1 - q; i++) {
                if (List[i].getFuelConsumption() > List[i + 1].getFuelConsumption()) {
                    double temp1 = List[i].getFuelConsumption();
                    List[i].fuelConsumption= List[i + 1].fuelConsumption;
                    List[i + 1].fuelConsumption = temp1;
                    String temp2 = List[i].getModel();
                    List[i].model = List[i + 1].model;
                    List[i + 1].model = temp2;
                }
            }
        }
        return List[0].getModel()  + " " + List[1].getModel()  + " " + List[2].getModel()  + " " + List[3].getModel()
                + " " + List[4].getModel()  + " " + List[5].getModel() ;
    }

    public static String findColourOfTheTaxi (ComfortTaxi[] List, String colour){
        String model = " ";
        for (ComfortTaxi taxis: List) {
            if (taxis.getColour().equals(colour)) {
                model = taxis.getModel();
            }
        }
        return model;
    }
}