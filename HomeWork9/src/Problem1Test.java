import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Problem1Test {

	public static void main(String[] args) throws IOException {
		StudentsandCourses studAndCourse = new StudentsandCourses();

		String file = new String("resources//students.txt");

		TreeMap<String, HashSet<Person>> test = studAndCourse
				.readPeopleFromFile(file);

		for (Map.Entry entry : test.entrySet()) {
			System.out.println(entry.getKey());
			@SuppressWarnings("unchecked")
			HashSet<Person> people = (HashSet<Person>) entry.getValue();
			for (Person person : people) {
				System.out.println(" " + person.toString());
			}
		}
	}

}
