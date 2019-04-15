package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import consumer.com.suplier.Employee;

public class Predicate {

	public static void main(String[] args) {

//			ArrayList<String> l = new ArrayList<String>();
//			l.add("Try");
//			l.add("Work Hard");
//			l.add("Success");
//			List<String> filtered = l.stream().filter(s -> s.length() > 2).collect(Collectors.<String>toList());
//			System.out.println(filtered);

//			List<String> names = Arrays.asList("Ana", "Riffu", "Risul", "kamrul", "Ria");
//			List<String> endWithR = names.stream().filter(name -> name.endsWith("l")).collect(Collectors.toList());
//			//System.out.println(startWithR);
//			
//			HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
//			map.put("Names",(ArrayList<String>) endWithR);
//			//System.out.println(map);
//			
//			for (Map.Entry<String, ArrayList<String>> entry : map.entrySet())  
//	            System.out.println("Key = " + entry.getKey() + 
//	                             ", Value = " + entry.getValue());

		Employee em = new Employee("1", "PikuR", "CEO");
		Employee em1 = new Employee("2", "Riku", "MD");
		Employee em2 = new Employee("3", "MikuR", "Manager");
		Employee em3 = new Employee("4", "TukR", "HR");

		List<Employee> employeeList = Arrays.asList(em,em1,em2,em3);
	

		ArrayList<Employee> endsWith = (ArrayList<Employee>) employeeList.stream()
				.filter(e -> e.getName().endsWith("R")).collect(Collectors.toList());
		System.out.println(endsWith.get(1));

		HashMap<String,ArrayList<Employee>> map=new HashMap<String,ArrayList<Employee>>();
		map.put("Employee1", endsWith);
		System.out.println(map.get(3));
		
		//Map<Object, Object> collect = map.
//				.filter(x -> x.getValue(employeeList.contains(o))
//				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
				
		
	}
}
