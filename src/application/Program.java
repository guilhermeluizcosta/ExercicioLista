package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i);
		    System.out.println("ID: ");
		    int id = sc.nextInt();
		    System.out.println("Name: ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    System.out.println("Salary: ");
		    double salary = sc.nextDouble();
		    Employee emp = new Employee(id,name,salary);
		    list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase:");
		int idsalary = sc.nextInt();
		Integer pos = hasId(list,idsalary);
		if(pos== null) {
			
			System.out.println("This id does not exist");
		}
		
		else {
			
			System.out.println("What percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee emp: list) {
			
			System.out.println(emp);
		}
      sc.close();
	}
	
	
	public static Integer hasId(List<Employee> list, int id) {
		
		for (int i=0; i< list.size(); i++) {
			
			if(list.get(i).getId()== id) {
				return i;
			}
			
		}
		return null;
	}

	

}
