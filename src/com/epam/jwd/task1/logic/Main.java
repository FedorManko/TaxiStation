package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.data.TaxiData;
import com.epam.jwd.task1.obj.TaxiPark;
import com.epam.jwd.task1.obj.TaxiPark.ComfortTaxi;
import com.epam.jwd.task1.printer.Printer;

public class Main {
    public static final int MAX_SPEED =211;
    public static final int MIN_SPEED = 199;
    public static final String COLOUR = "Black";
    public static void main(String[] args) {
        TaxiPark[] array = TaxiData.List();
        ComfortTaxi[] array1 = TaxiData.List1();
        int costOfTaxiPark = LogisticCenter.calculateCostOfTaxiPark(array);
        Printer.printString("Cost of the taxi park: " + costOfTaxiPark);

        String findCarWithSpeed = LogisticCenter.findCarWithSpeed(array, MAX_SPEED, MIN_SPEED);
        Printer.printString("Your car model: " + findCarWithSpeed);

        double maxFuelConsumption = LogisticCenter.findMaxFuelConsumption(array);
        Printer.printString("Max fuel consumption: " + maxFuelConsumption);

        String modelsOfTaxi = LogisticCenter.fuelAscendingOrder(array);
        Printer.printString("Models in ascending order by fuel: " + modelsOfTaxi);

        String modelCar = LogisticCenter.findColourOfTheTaxi(array1, COLOUR);
        Printer.printString("Your model: " + modelCar);

        TaxiPark  taxi = TaxiData.List()[0];
        Printer.printString("Time of travel: " + taxi.findTimeOfTravel());
        ComfortTaxi taxi1 = TaxiData.List1()[1];
        Printer.printString("Your fare: " + taxi1.findPaymentForTravel());

    }
}
