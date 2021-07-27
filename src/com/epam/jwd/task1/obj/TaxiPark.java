package com.epam.jwd.task1.obj;

import com.epam.jwd.task1.logic.OperationWithTaxi;

import java.util.Objects;

public class TaxiPark implements OperationWithTaxi {

    public String model;
    private int costOfTheModel;
    private int speed;
    private int path;
    public double fuelConsumption;
    private double payment;

    public TaxiPark() {

    }

    public TaxiPark(
            String model, int costOfTheModel, int speed, int path, double fuelConsumption, double payment
    ) {
        this.model = model;
        this.costOfTheModel = costOfTheModel;
        this.speed = speed;
        this.path = path;
        this.fuelConsumption = fuelConsumption;
        this.payment = payment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getCostOfTheModel() {
        return costOfTheModel;
    }

    public void setCostOfTheModel(final int costOfTheModel) {
        this.costOfTheModel = costOfTheModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public int getPath() {
        return path;
    }

    public void setPath(final int path) {
        this.path = path;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(final double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(final double payment) {
        this.payment = payment;
    }

    @Override
    public int findTimeOfTravel() {
        return path / speed;
    }

    @Override
    public double findPaymentForTravel() {
        return (int) (path * payment);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TaxiPark taxiPark = (TaxiPark) o;
        return costOfTheModel == taxiPark.costOfTheModel && speed == taxiPark.speed && path == taxiPark.path
                && Double.compare(taxiPark.fuelConsumption, fuelConsumption) == 0
                && Double.compare(taxiPark.payment, payment) == 0 && Objects.equals(model, taxiPark.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, costOfTheModel, speed, path, fuelConsumption, payment);
    }

    @Override
    public String toString() {
        return String.format("%-10s " + "Model: %s | " + "Cost of the model: %s | " + "Speed: %s |"
                        + "Path: %s |" + "Fuel consumption: %s |" + "Payment: %s |" , getClass().getSimpleName(), getModel(),
                getCostOfTheModel(), getSpeed(), getPath(), getFuelConsumption(), getPayment());
    }
}
