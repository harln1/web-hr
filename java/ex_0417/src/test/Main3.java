package test;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
	 public static void main(String[] args) {
	        ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("김철수", 3500));
	        employees.add(new Employee("이영희", 4500));
	        employees.add(new Employee("박민수", 3000));
	        employees.add(new Employee("최지우", 5000));

	      
	        Collections.sort(employees, (e1, e2) -> e2.salary - e1.salary);
	        System.out.println("--- 급여 높은 순 ---");
	        for (Employee e : employees) e.printInfo();

	        
	        Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
	        System.out.println("\n--- 이름 오름차순 ---");
	        for (Employee e : employees) e.printInfo();
	    }
	}
