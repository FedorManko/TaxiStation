package com.epam.jwd.task1.obj;

import java.util.Objects;

public  class PremiumTaxi extends TaxiPark {
	private int numberOfSeats;

	public PremiumTaxi( String model,  int costOfTheModel,  int speed,  int path,  double fuelConsumption,
			 double payment,  int numberOfSeats
	) {
		super(model, costOfTheModel, speed, path, fuelConsumption, payment);
		this.numberOfSeats = numberOfSeats;
	}
	public PremiumTaxi(){

	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
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
		final PremiumTaxi that = (PremiumTaxi) o;
		return numberOfSeats == that.numberOfSeats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), numberOfSeats);
	}

	@Override
	public String toString() {
		return String.format("%-10s " + "Model: %s | " + "Cost of the model: %s | " + "Speed: %s |"
						+ "Path: %s |" + "Fuel consumption: %s |" + "Payment: %s |" + "Number of seats: %s |" ,
				getClass().getSimpleName(), getModel(), getCostOfTheModel(), getSpeed(), getPath(),
				getFuelConsumption(), getPayment(),getNumberOfSeats());
	}
}
