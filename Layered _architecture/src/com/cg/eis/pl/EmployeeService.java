package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;


interface Service {
	//Interface mentioning all necessary method signatures
	void addEmployee(Employee emp);
	Employee getByInsuranceScheme(String insuranceScheme);
	void deleteEmployee(int id);
}

public class EmployeeService implements Service
{

	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Employee> hm=new HashMap<Integer, Employee>();
	{
		hm.put(101, new Employee(101,"Ramu",10000,"System Associate","Scheme C"));
		hm.put(102, new Employee(102,"Ravi",20000,"Programmer","Scheme B"));
		hm.put(103, new Employee(103,"Vinay",50000,"Manager","Scheme A"));
		
	}
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//Add employee details to Hashmap.
		hm.put(emp.getId(), emp);
	}

	@Override
	public Employee getByInsuranceScheme(String insuranceScheme) {
		// TODO Auto-generated method stub
		//Display employee based on scheme
		for(Map.Entry<Integer, Employee> entry:hm.entrySet())
		{
			//System.out.println(entry.getValue().getInsuranceScheme()+ " "+insuranceScheme);
			if(entry.getValue().getInsuranceScheme().equals(insuranceScheme))
				return entry.getValue();
		}
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		//Delete an employee from Map
		hm.remove(id);
	}
	
	public void viewAllEmployee()
	{
		System.out.println(hm);
	}
	
}