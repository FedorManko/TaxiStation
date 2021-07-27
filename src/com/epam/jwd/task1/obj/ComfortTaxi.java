package com.epam.jwd.task1.obj;

import java.util.Objects;

public class ComfortTaxi extends TaxiPark {
	private String colour;

	public ComfortTaxi(String model,  int costOfTheModel,  int speed, int path,  double fuelConsumption,
			 double payment,  String colour) {
		super(model, costOfTheModel, speed, path, fuelConsumption, payment);
		this.colour = colour;
	}

	public ComfortTaxi(){

	}

	public String getColour() {
		return colour;
	}

	public void setColour(final String colour) {
		this.colour = colour;
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
		final ComfortTaxi that = (ComfortTaxi) o;
		return Objects.equals(colour, that.colour);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), colour);
	}
	@Override
	public String toString() {
		return String.format("%-10s " + "Model: %s | " + "Cost of the model: %s | " + "Speed: %s |"
						+ "Path: %s |" + "Fuel consumption: %s |" + "Payment: %s |" + "Colour: %s |" ,
				getClass().getSimpleName(), getModel(), getCostOfTheModel(), getSpeed(), getPath(),
				getFuelConsumption(), getPayment(),getColour());
	}
}
