package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula93 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());

		System.out.println("--------------");

		for (String l : list) {
			System.out.println(l);
		}

		System.out.println("--------------");

		// list.remove("Anna");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String l : list) {
			System.out.println(l);
		}

		System.out.println("--------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("--------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String l : result) {
			System.out.println(l);
		}

		System.out.println("--------------");

		String name1 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name1);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}

}
