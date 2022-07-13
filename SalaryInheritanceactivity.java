package Assignmentss;
// the ineritance activity done from employeees class program
public class SalaryInheritanceactivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("details of manager:- ");
Manager m=new Manager(15,"ravi","vizag",234567,50000);
m.calculateSalary();
m.calculateTransportAllowence();
System.out.println("details of trainee:- ");
Trainee t=new Trainee(10,"raju","mvp",123456,25000);
t.calculateSalary();
t.calculateTransportAllowence();
	}

}
