// calculating employe salary fixed and hours based using java 
abstract class Employee {
	abstract void calculateSalary(int hours , int days);
		
	 
	abstract void displayDetails(String name , int age );
		

}
class Manager extends Employee{
    float salary;
	@Override
	void calculateSalary(int hours , int days) {
		
		salary = 40 * days;
		salary = salary;
		
		if(hours == 40 ) {
			System.out.println(" fixed salary :  " + salary);
			}
		else {
			System.out.println(" hours are fixed cannot be changed");
			
		}
	}
	@Override
	void displayDetails(String name , int age ) {
		System.out.println(" name of employee : " + name + " & " + "age of employee is :" + age + " & " + "salary is : " + salary);
		
	}
	
}
class Developer extends Employee{
    float number;
	@Override
	void calculateSalary(int hours , int days) {
		
		number = hours* days;

		System.out.println(" hourly based salary " + number);
		}
	@Override
	void displayDetails(String name , int age ) {
		System.out.println(" name of employee : " + name + " & " + "age of employee is : " + age + " & " + "salary is : " + number);
	}
	
}
class  EmployeeSalary{
	public static void main(String [] args){
		Manager m = new Manager();
		m.calculateSalary(40, 8);
		m.displayDetails("devank", 21);
		
		Manager m1 = new Manager();
		m1.calculateSalary(40, 10);
		m1.displayDetails("kushal", 20);
		
		Manager m2 = new Manager();
		m1.calculateSalary(44, 10);
		m1.displayDetails("rahul", 20);
		
		
		Developer d = new Developer();
		d.calculateSalary(20, 7);
		d.displayDetails("kuldhwaj",  24);
		
		Developer d1 = new Developer();
		d.calculateSalary(27, 10);
		d.displayDetails("dhyani",  18);
	}
}
