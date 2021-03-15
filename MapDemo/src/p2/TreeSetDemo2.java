package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import p1.Employee;
import p3.SortEmployeeSalary;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet<Employee> empSet = new TreeSet<>();
		
		Employee e1 = new Employee(101, "sregtergtA",200);
		Employee e2 = new Employee(12, "rgerB",850);
		Employee e3 = new Employee(173, "Afdver",100);
		Employee e4 = new Employee(4104, "dfgerA",360);
		Employee e5 = new Employee(6105, "yhjrtrA",1505);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		for (Employee employee : empSet) {
		
			if(employee.getSalary()>700)
			{
				System.out.println(employee);
			}
			
			
		}
		
		
		
		System.out.println(" ---- Sorting Based on Salary---");
		
		
		List<Employee> sortedIdList = new ArrayList<>();
		sortedIdList.addAll(empSet);
		Collections.sort(sortedIdList, new SortEmployeeSalary());
		
		for (Employee employee : sortedIdList) {
			System.out.println(employee);
		}
		
		
			
		
	}
}
