package learning.oops;

public class Employee {

	int empId;
	String empName;
	long empSalary;

	/*Employee(int id, String name, long salary) {
		empId = id;
		empName = name;
		empSalary = salary;

	}*/
	//method takes parameters
	void setData(int id, String name, long salary) {
		empId = id;
		empName = name;
		empSalary = salary;

	}

	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
	}

	public static void main(String args[]) {

		// Assigning values to class variables using object
		/*Employee emp1 = new Employee(); 
		emp1.empId = 100;
		emp1.empName = "Gaurisankar";
		emp1.empSalary = 200000;
		emp1.display();*/

		// Assigning values to the class variables using constructor
		//constructor will be invoked at the time of object itself
		/*Employee emp1 = new Employee(103, "Sulu", 90000);
		emp1.display();*/
		
		//Assigning values to the class variables using method
		Employee emp = new Employee();
		emp.setData(109, "Anjali", 80000);
		emp.display();

	}

}
