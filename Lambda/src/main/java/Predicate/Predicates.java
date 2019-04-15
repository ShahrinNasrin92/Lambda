package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import Main.Employee;
import Main.Student;

public class Predicates {

	public static void main(String[] args) {

		Employee em = new Employee("1", "PikuR", "CEO");
		Employee em1 = new Employee("2", "Riku", "MD");
		Employee em2 = new Employee("3", "MikuR", "Manager");
		Employee em3 = new Employee("4", "TukR", "HR");

		Student st = new Student(1, "Shahrin", "CSE");
		Student st2 = new Student(2, "Joyee", "EEE");
		Student st3 = new Student(3, "Risul", "ECE");

		List<Employee> preList = Arrays.asList(em, em1, em2, em3);

		List<Student> prelist2 = Arrays.asList(st, st2, st3);

		Predicate<Employee> pr = t -> t.getName().startsWith("R") && t.getName().endsWith("u");
		printPredicate(preList, pr);// for list print

		Predicate<String> ab = t -> t.startsWith("R");
		HashMap<Integer, List> hash = new HashMap<>();

		hash.put(1001, preList);
		hash.put(1002, prelist2);
		// System.out.println(hash);

		hashPrint(hash, ab); // for hashmap print

	}

	private static void printPredicate(List<Employee> preList, Predicate<Employee> pr) {
		List<String> result = new ArrayList<>();

		for (Employee emp : preList) {
			if (pr.test(emp)) {
				result.add(emp.getName());
			}
		}
		System.out.println(result);
	}

	private static void hashPrint(HashMap<Integer, List> hash, Predicate<String> ab) 
	{

		for (Map.Entry<Integer, List> map : hash.entrySet()) {
			Integer key = map.getKey();
			List values = map.getValue();

			for (Object e : values) {
				//System.out.println(e);
			}
		}
	}
}
// System.out.println(key+"\t " +values);

//		for( e: values) {
//			if(ab.test(e.getName())) {
//				System.out.println(key+"\t"+e.getId()+
//						"\t"+e.getName()+"\t"+e.getDesignation());
//			}
//		}

// predicate with String

//	List<String> filtered = l.stream().filter(s -> s.length() > 2).collect(Collectors.<String>toList());
//	System.out.println(filtered);

//	List<String> names = Arrays.asList("Ana", "Riffu", "Risul", "kamrul", "Ria");
//	List<String> endWithR = names.stream().filter(name -> name.endsWith("l")).collect(Collectors.toList());
//	//System.out.println(startWithR);

//	HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
//	map.put("Names",(ArrayList<String>) endWithR);
//	//System.out.println(map);
//	
//	for (Map.Entry<String, ArrayList<String>> entry : map.entrySet())  
//        System.out.println("Key = " + entry.getKey() + 
//                         ", Value = " + entry.getValue());

//predicate with objects

//		ArrayList<Employee> endsWith = (ArrayList<Employee>) employeeList.stream()
//				.filter(e -> e.getName().endsWith("R")).collect(Collectors.toList());
//		System.out.println(endsWith.get(1));

//		HashMap<String, ArrayList<Employee>> map = new HashMap<String, ArrayList<Employee>>();
//		map.put("Employee1", endsWith);
//		System.out.println(map.get(3));

// boolean result = startsWithA.and(endsWithA).test("Hi");

// Map<Object, Object> collect = map.
//				.filter(x -> x.getValue(employeeList.contains(o))
//				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
