package Ex2;

import java.util.StringTokenizer;

public class Address {
	private final String country, region, city, street, houseNumber, building, apartment;

	public Address(String data) {
		String[] temp = data.trim().split("\\,\\s*|\\;\\s+|\\.\\s*");
		country = temp[0];
		region = temp[1];
		city = temp[2];
		street = temp[3];
		houseNumber = temp[4];
		building = temp[5];
		apartment = temp[6];
	}

	public Address(String data, boolean tokenize) {
		StringTokenizer tokenizer = new StringTokenizer(data, "\\,\\s*|\\;\\s+|\\.\\s*");
		country = tokenizer.nextToken().trim();
		region = tokenizer.nextToken().trim();
		city = tokenizer.nextToken().trim();
		street = tokenizer.nextToken().trim();
		houseNumber = tokenizer.nextToken().trim();
		building = tokenizer.nextToken().trim();
		apartment = tokenizer.nextToken().trim();
	}

	String getCountry() {
		return country;
	}

	String getRegion() {
		return region;
	}

	String getCity() {
		return city;
	}

	String getStreet() {
		return street;
	}

	String getHouseNumber() {
		return houseNumber;
	}

	String getBuilding() {
		return building;
	}

	String getApartment() {
		return apartment;
	}

	public String toString() {
		return country +
				", " + region +
				", " + city +
				", " + street +
				", " + houseNumber +
				", " + building +
				", " + apartment;
	}
}
