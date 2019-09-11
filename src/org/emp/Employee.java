package org.emp;

public class Employee {
	public void empId() {
		System.out.println("1");
	}
	public void empname(){
		System.out.println("Ramesh");
	}
	public void empDob() {
		System.out.println("01/08/1992");
	}
	public void empEmail() {
		System.out.println("ramesh1992@gmail.com");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empname();
		emp.empDob();
		emp.empEmail();
		
	}

}
