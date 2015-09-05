import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentsandCourses {
	TreeMap<String, TreeSet<Person>> entry;

	public void readPeopleFromFile(String fileName) throws IOException {
		TreeMap<String, TreeSet<Person>> dictionary = new TreeMap<String, TreeSet<Person>>();
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
						TreeSet<Person> setOfPerson = new TreeSet<Person>();
						setOfPerson.add(new Person(firsName, lastname));
						dictionary.put(course, setOfPerson);
					} else {
						Set<Person> setOfPerson = dictionary.get(course);
						setOfPerson.add(new Person(firsName, lastname));
					}
				}
				line = br.readLine();
			}
			entry = dictionary;
		}
	}

	public void print(){
		for (Map.Entry entry : entry.entrySet()) {
			System.out.println(entry.getKey());
			@SuppressWarnings("unchecked")
			TreeSet<Person> people = (TreeSet<Person>) entry.getValue();
			for (Person person : people) {
				System.out.println(person.toString());
			}
	
		}
	}
}
