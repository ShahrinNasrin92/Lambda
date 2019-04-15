package Consumer1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import consumer.com.suplier.Employee;

public class Consumer {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Ana", "Riffu", "abc");
//		names.forEach(name -> System.out.println(names));
//
//		Map<String, Integer> ages = new HashMap<>();
//		ages.put("Ana", 24);
//		ages.put("Riffu", 25);
//		ages.put("abc", 26);
//
//		ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
		Employee em = new Employee("1", "Piku", "CEO");
		Employee em1 = new Employee("2", "RikuR", "MD");
		Employee em2 = new Employee("3", "Miku", "Manager");
		Employee em3 = new Employee("4", "TukR", "HR");

		List<Employee> employee = Arrays.asList(em, em1, em2, em3);
		employee.forEach(list -> {
			// System.out.println(list);
		});

		employee.forEach(list -> {
			if (list.getName().endsWith("R")) {
				System.out.println(list.getName());
			}
		});

		em3.setName("Abc");
		HashMap<String, Employee> map = new HashMap<String, Employee>();
		map.put("Emplpyee", em);
		map.put("Employee1", em1);
		map.put("Employee3", em3);
		// System.out.println(map);

		for (Map.Entry<String, Employee> employeeStringEntry : map.entrySet()) {
			System.out.println(employeeStringEntry.getKey());
		}
		System.out.println(map.get(em3));

	}
}