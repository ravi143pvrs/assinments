package Assignmentss;

import java.util.Scanner;

public class Switchh {

	public static void main(String[] args) {
System.out.println("enter your switch number  ");
Scanner s = new Scanner(System.in);
int w = s.nextInt();
String x[] = {"ravi","raju","ramu","rao","roy"};
switch(w) {
case 1: if(x[0]=="roy") {
	System.out.println("switch case is very easy ");
}
break;
case 2: if(x[1]=="roy") {
	System.out.println("switch case is very easy for anybody");
}
break;
case 3: if(x[2]=="roy") {
	System.out.println("switch case is very easy for u");
}
break;
case 4: if(x[4]=="roy") {
	System.out.println("switch case is very easy for any1");
}
break;
default: System.out.println("switch case is easy for me");
}
	}
}