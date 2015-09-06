package problem1;
import java.util.Comparator;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;

	public Person(String first, String last) {
		setFirstName(first);
		setLastName(last);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName+lastName;
	}

	@Override
	public int hashCode() {
		return (int) getFirstName().hashCode() + getLastName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (this.getFirstName().equals(other.getFirstName())) {
			return (getLastName().equals(other.getLastName()));
		} else {
			return (this.getFirstName().equals(other.getFirstName()));
		}
	}

	@Override
	public int compareTo(Person o) {
		return this.getLastName().compareTo(o.getLastName());
	}

}
