package StreamPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTestClass {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(
				new Employee("1001", "Manish", "India", "9953895446", (double) 90000, 2015),
				new Employee("1002", "Rahul", "India", "7878787878", (double) 30000, 2016),
				new Employee("1003", "Sushant", "India", "4545454545", (double) 80000, 2017),
				new Employee("1004", "Mohan", "India", "6553454555", (double) 70000, 2018));

		Optional<Employee> secondHightestSalariedEmp = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed()).skip(1).findFirst();
		System.out.println("Second Highested Salaried Employee: ");
		System.out.println(secondHightestSalariedEmp);
		
		List<Employee> employeeList2017 = employeeList.stream().filter(l-> l.getYearOfJoining()>2017).collect(Collectors.toList());
		System.out.println(employeeList2017);
		
		List<String> xxxx = employeeList.stream().filter(l-> l.getYearOfJoining()>2017).map(Employee::getEmployeeName).collect(Collectors.toList());
		xxxx.forEach(System.out::println);
	}
	
	
	
	

}
