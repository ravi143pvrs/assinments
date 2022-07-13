package Assignmentss;

public class Employeees {
long employeeid;
String employeename,employeeadress;
long employeephone;
double basicsal;
double splall=250.80;
double hra=1000.50;

Employeees(long Id,String Name,String Address,long phone,double basicsal) {
	this.employeeid=Id;
	this.employeename=Name;
	this.employeeadress=Address;
	this.employeephone=phone;
	this.basicsal=basicsal;
	
}
 void calculateSalary() {
	double salary=basicsal+(basicsal*splall/100)+(basicsal*hra/100);
	System.out.println(salary);
}
 void calculateTransportAllowence() {
	 double transportAllowence=10*basicsal/100;
	 System.out.println(transportAllowence);
 }
}

class Manager extends Employeees {
	Manager(long id,String name,String address,long phone,double salary) {
		super(id,name,address,phone,salary);
		basicsal=salary;
	}
	void calculateTransportAllowence() {
		double transportAllowence=15*basicsal/100;
		System.out.println(transportAllowence);
	}}
	class Trainee extends Employeees {
		Trainee(long id,String name,String address,long phone,double salary) {
			super(id,name,address,phone,salary);
			basicsal=salary;
		}		
		}