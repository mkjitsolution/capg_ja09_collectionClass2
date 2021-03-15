package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeProjectMapDemo {
	
	public static void main(String[] args) {
		
		Map<Project, List<Employee>> projectinfoMap = new HashMap<>();
		
		
		Employee e1 = new Employee(101, "A");
		Employee e2 = new Employee(102, "A");
		Employee e3 = new Employee(103, "A");
		Employee e4 = new Employee(104, "A");
		Employee e5 = new Employee(105, "A");
		
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		
		List<Employee>  project1EmployeeList = new ArrayList<>();
		List<Employee>  project2EmployeeList = new ArrayList<>();
		
		
		project1EmployeeList.add(e1);
		project1EmployeeList.add(e2);
		project1EmployeeList.add(e3);
		
		project2EmployeeList.add(e4);
		project2EmployeeList.add(e5);
		
		
		
		
		projectinfoMap.put(p1, project1EmployeeList);
		projectinfoMap.put(p2, project2EmployeeList);
		
		
		Iterator<Project> itrP = projectinfoMap.keySet().iterator();
		
		while(itrP.hasNext())
		{
			   Project p = itrP.next();
			   for (Employee employee : projectinfoMap.get(p)) {
				System.out.println(employee);
			}
			
		}
		
	}

}
