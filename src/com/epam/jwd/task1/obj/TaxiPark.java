package com.epam.jwd.task1.obj;

import com.epam.jwd.task1.logic.OperationWithTaxi;

public class TaxiPark implements OperationWithTaxi {
    public String model;
    private final int costOfTheModel;
    private final int speed;
    private final int path;
    public  double fuelConsumption;
    private final double payment;

    public TaxiPark(String model, int costOfTheModel, int speed, int path, double fuelConsumption,double payment) {
        this.model = model;
        this.costOfTheModel = costOfTheModel;
        this.speed = speed;
        this.path = path;
        this.fuelConsumption = fuelConsumption;
        this.payment = payment;
    }

    public int getCostOfTheModel() {
        return costOfTheModel;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int findTimeOfTravel() {
       return path/speed;
    }

    @Override
    public double findPaymentForTravel() {
        return  (int)(path*payment);
    }

    public static class PremiumTaxi extends TaxiPark {
       public int numberOfSeats;

        public PremiumTaxi(String model, int costOfTheModel, int speed, int numberOfSeats, int path, double fuelConsumption, double payment) {
            super(model, costOfTheModel, speed, path, fuelConsumption, payment);
            this.numberOfSeats = numberOfSeats;
        }

    }
    public static class ComfortTaxi extends TaxiPark {
        private final String colour;

        public ComfortTaxi(String model, int costOfTheModel, int speed, String colour, int path, double fuelConsumption, double payment) {
            super(model, costOfTheModel, speed, path, fuelConsumption, payment);
            this.colour = colour;
        }

        public String getColour() {
            return colour;
        }

    }
    public static class EconomyTaxi extends TaxiPark {
        public String interiorMaterial;

        public EconomyTaxi(String model, int costOfTheModel, int speed, String interiorMaterial, int path,double fuelConsumption, double payment) {
            super(model, costOfTheModel, speed, path, fuelConsumption, payment);
            this.interiorMaterial = interiorMaterial;
        }
    }
}
