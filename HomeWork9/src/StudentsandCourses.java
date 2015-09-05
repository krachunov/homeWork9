import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

public class StudentsandCourses {

	public TreeMap<String, HashSet<Person>> readPeopleFromFile(String fileName)
			throws IOException {
		TreeMap<String, HashSet<Person>> dictionary = new TreeMap<String, HashSet<Person>>();
		File file = new File(fileName);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			String regex = ":";

			while (line != null) {
				String tmp = line.trim();
				String[] separatedName = tmp.split(regex);
				if (separatedName.length == 3) {
					String firsName = separatedName[0];
					String lastname = separatedName[1];
					String course = separatedName[2];
					if (!dictionary.containsKey(course)) {
						HashSet<Person> setOfPerson = new HashSet<Person>();
						setOfPerson.add(new Person(firsName, lastname));
						dictionary.put(course, setOfPerson);
					} else {
						HashSet<Person> setOfPerson = dictionary.get(course);
						setOfPerson.add(new Person(firsName, lastname));
					}
				}
				line = br.readLine();
			}
			return dictionary;
		}
	}
}
