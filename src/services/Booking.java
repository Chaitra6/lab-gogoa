package services;

public class Booking{
	public double booking(int noOfPersons,int rates) {
		double total_rate = noOfPersons * rates;
		return total_rate;
	}
}

