package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	List<Employee> list=Arrays.asList(new Employee("101", "ANA", "Trainee"));
	
	HashMap<Integer, List<Employee>> hash=new HashMap<>();
	hash.put(1001, list);
	Predicate<String> emp= e -> e.startsWith("S") && e.endsWith("P");
	hashPrint(hash, emp);

}

private static void hashPrint(HashMap<Integer, List<Employee>> hash, Predicate<String> emp) {

	for(Map.Entry<Integer, List<Employee>> map: hash.entrySet()) {
		Integer key=map.getKey();
		List<Employee> values = map.getValue();
		for(Employee e: values) {
			if(emp.test(e.getName())) {
				System.out.println(key+"\t"+e.getId()+
						"\t"+e.getName()+"\t"+e.getDesignation());
			}
		}
	}
	
}
}
