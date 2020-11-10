package Ex2;

public class Exercise2 {
	public Exercise2() {
		Address address = new Address("Russia, Central, Moscow, Trubnaya Street, 24, bd 3, 30");
		System.out.println("Address (split() variant): " + address);
		System.out.println("Country: " + address.getCountry());
		System.out.println("Region: " + address.getRegion());
		System.out.println("City: " + address.getCity());
		System.out.println("Street: " + address.getStreet());
		System.out.println("HouseNumber: " + address.getHouseNumber());
		System.out.println("Building: " + address.getBuilding());
		System.out.println("Apartment: " + address.getApartment());
		System.out.println();

		Address addressTokenized = new Address("United Kingdom, Central, London, Newport, 24, WK69, 20b", true);
		System.out.println("Address (StringTokenizer variant): " + addressTokenized);
		System.out.println("Country: " + addressTokenized.getCountry());
		System.out.println("Region: " + addressTokenized.getRegion());
		System.out.println("City: " + addressTokenized.getCity());
		System.out.println("Street: " + addressTokenized.getStreet());
		System.out.println("HouseNumber: " + addressTokenized.getHouseNumber());
		System.out.println("Building: " + addressTokenized.getBuilding());
		System.out.println("Apartment: " + addressTokenized.getApartment());
	}
}
