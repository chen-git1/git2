package com.softeem.packtest;

public class EmployTest {
	public static void main(String[] args) {
		//创建一个员工对象 
		Employ emp1 = new Employ();
		
		Employ emp2 = new Employ();
		emp2.name = "小灰灰";
		emp2.salary = 2000 ;
		
		Employ emp3 = new Employ();
		emp3.name = "小白";
		emp3.salary = 5000 ;
	
		emp1.print();
		emp2.print();
		emp3.print();
		
		System.out.println
				(emp1.salary + emp2.salary + emp3.salary);
	}
}
