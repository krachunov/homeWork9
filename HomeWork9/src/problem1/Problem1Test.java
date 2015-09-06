package problem1;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Problem1Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {
		StudentsandCourses studAndCourse = new StudentsandCourses();

		String file = new String("resources//students.txt");

		studAndCourse.readPeopleFromFile(file);
		studAndCourse.print();

	}

}
