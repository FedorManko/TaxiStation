package com.epam.jwd.task1.obj;

import java.util.Objects;

public  class EconomyTaxi extends TaxiPark {
	public String interiorMaterial;

	public EconomyTaxi(String model, int costOfTheModel, int speed, String interiorMaterial, int path,double fuelConsumption, double payment) {
		super(model, costOfTheModel, speed, path, fuelConsumption, payment);
		this.interiorMaterial = interiorMaterial;
	}
	public EconomyTaxi(){

	}
	public String getInteriorMaterial() {
		return interiorMaterial;
	}

	public void setInteriorMaterial(String interiorMaterial) {
		this.interiorMaterial = interiorMaterial;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		final EconomyTaxi that = (EconomyTaxi) o;
		return Objects.equals(interiorMaterial, that.interiorMaterial);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), interiorMaterial);
	}

	@Override
	public String toString() {
		return String.format("%-10s " + "Model: %s | " + "Cost of the model: %s | " + "Speed: %s |"
						+ "Path: %s |" + "Fuel consumption: %s |" + "Payment: %s |" + "Interior material: %s |" ,
				getClass().getSimpleName(), getModel(), getCostOfTheModel(), getSpeed(), getPath(),
				getFuelConsumption(), getPayment(),getInteriorMaterial());
	}
}