package p3;

import java.util.Comparator;

import p1.Employee;

public class SortEmployeeName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

	
}
