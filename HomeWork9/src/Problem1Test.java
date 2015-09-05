import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;

public class Problem1Test {

	public static void main(String[] args) throws IOException {
		StudentsandCourses studAndCourse = new StudentsandCourses();

		String file = new String("resources//students.txt");
		@SuppressWarnings("unused")
		TreeMap<String, HashSet<Person>> test = studAndCourse
				.readPeopleFromFile(file);
		System.out.println(test.size());
	}

}
