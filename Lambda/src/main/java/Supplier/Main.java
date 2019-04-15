package Supplier;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import Main.Student;
import Main.Trade;


public class Main 
{
  public static void main(String[] args) {
	 
	  Trade t = new Trade(1, "IBM", 1000, "NEW");
	 Trade t1 = new Trade(2, "APPL", 2000, "Old");
	 Trade t2 = new Trade(3, "IBM", 3000, "NEW");
	 Trade t3 = new Trade(4, "IBM", 4000, "PENDING");
	 
	 Student st = new Student(1, "Shahrin", "CSE");
		Student st2 = new Student(2, "Joyee", "EEE");
		Student st3 = new Student(3, "Risul", "ECE");
		List<Student> student = Arrays.asList(st, st2, st3);
	 
	  List<Trade> trades =Arrays.asList(t,t1,t2,t3);
    Supplier<List<Trade>> supplier = () -> trades;

    //System.out.println("Supplier Result " + supplier.get());
  
  HashMap<Integer,List> supplierMap=new HashMap<>();
  supplierMap.put(1001, student);
  supplierMap.put(1002, trades);
  System.out.println(supplierMap);
  Supplier<List> mapSup = () -> student;
  


  for(Map.Entry<Integer, List> employeeEntry:supplierMap.entrySet())
	{
		Integer key=employeeEntry.getKey();
		List values=employeeEntry.getValue();
		for(Object e:values)
		{
			System.out.println( e);
		}
		
	}
  
  
}
}


