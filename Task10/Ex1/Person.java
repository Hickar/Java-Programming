package Ex1;

public class Person {
	private final String firstname, lastname, patronymic;

	public Person(String lastname) {
		this.lastname = lastname;
		this.firstname = "";
		this.patronymic = "";
	}

	public Person(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.patronymic = "";
	}

	public Person(String lastname, String firstname, String patronymic) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.patronymic = patronymic;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(lastname);
		if (!firstname.isEmpty()) result.append(" ").append(firstname);
		if (!patronymic.isEmpty()) result.append(" ").append(patronymic);
		return result.toString();
	}
}
