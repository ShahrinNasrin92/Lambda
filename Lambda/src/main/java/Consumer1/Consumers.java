package Consumer1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import Main.Employee;
import Main.Student;

public class Consumers {

	public static void main(String[] args) {

		Employee em = new Employee("1", "Piku", "CEO");
		Employee em1 = new Employee("2", "RikuR", "MD");
		Employee em2 = new Employee("3", "Miku", "Manager");
		Employee em3 = new Employee("4", "TukR", "HR");
		
		Student st = new Student(1, "Shahrin", "CSE");
		Student st2 = new Student(2, "Joyee", "EEE");
		Student st3 = new Student(3, "Risul", "ECE");
		

		List<Employee> employee = Arrays.asList(em, em1, em2, em3);
		List<Student> Student = Arrays.asList(st, st2, st3);

		HashMap<Integer, List> map = new HashMap<>();
		map.put(1001, employee);
		map.put(1002,Student);
		Consumer<Employee> consumer = (x) -> System.out.println(x.getName());
		{
			for (Employee e : employee) {
				if (e.getName().startsWith("P"))
					consumer.accept(e);
			}
		}
		Consumer<Student> stConsumer = (x) -> System.out.println(x.getDept());
		for(Map.Entry<Integer, List> employeeEntry:map.entrySet())
		{
			Integer key=employeeEntry.getKey();
			List values=employeeEntry.getValue();
			for(Object e:values)
			{
				if(map.containsValue(st2.getName().startsWith("R")))
				{
					stConsumer.accept(st2);
					//System.out.println("Keys:" +key +"\t "+"Values:" +values);
				}
			}
			
		}
			
	}
}

// consumer for String

//List<String> names = Arrays.asList("Ana", "Riffu", "abc");
//names.forEach(name -> System.out.println(names));
//
//Map<String, Integer> ages = new HashMap<>();
//ages.put("Ana", 24);
//ages.put("Riffu", 25);
//ages.put("abc", 26);
//
//ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));

// Consumer for object

//		employee.forEach(list -> {
//			// System.out.println(list);
//		});
//
//		employee.forEach(list -> {
//			if (list.getName().endsWith("R")) {
//				System.out.println(list.getName());
//			}
//		});
//
//		em3.setName("Abc");
//		HashMap<String, Employee> map = new HashMap<String, Employee>();
//		map.put("Emplpyee", em);
//		map.put("Employee1", em1);
//		map.put("Employee2", em2);
//		map.put("Employee3", em3);
//		// System.out.println(map);
//
//		for (Map.Entry<String, Employee> employeeStringEntry : map.entrySet()) {
//			System.out.println(employeeStringEntry.getKey());
//		}
//		//System.out.println(map.get(em3));
