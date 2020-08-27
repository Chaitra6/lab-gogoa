package services;

import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking {

	public double book(Hotel hotel) {

		double tarrif;
		int noOfPersons = hotel.getNoOfPersons();
		int rates = hotel.getRates();
		long days = ChronoUnit.DAYS.between(hotel.getFromdate(), hotel.getTodate());
		int month = hotel.getFromdate().getMonthValue();

		double rate = super.booking(noOfPersons, rates);

		System.out.println(month);
		System.out.println(rate);
		System.out.println(days);

		if ((month >= 1 && month < 4) || (month > 6 && month < 11)) {
			tarrif = (rate - (rate * (25 / 100.0))) * days;
			System.out.println(tarrif);
		} else {
			tarrif = (rate + (rate * (50 / 100.0))) * days;
			System.out.println(tarrif);
		}
		return tarrif;

	}

	public double book(Flight flight) {
		int noOfPersons = flight.getNoOfPersons();
		int rates = flight.getRates();
		double total_rate = super.booking(noOfPersons, rates);

		System.out.println(total_rate);
		return total_rate;
	}

	public double book(Train train) {
		int noOfPersons = train.getNoOfPersons();
		int rates = train.getRates();
		double total_rate = super.booking(noOfPersons, rates);
		System.out.println(total_rate);
		return total_rate;

	}

	public double book(Bus bus) {
		int noOfPersons = bus.getNoOfPersons();
		int rates = bus.getRates();
		double total_rate = super.booking(noOfPersons, rates);
		System.out.println(total_rate);
		return total_rate;
	}

}