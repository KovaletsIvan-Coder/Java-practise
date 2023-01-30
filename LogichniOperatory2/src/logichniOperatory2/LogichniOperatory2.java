package logichniOperatory2;

import java.util.Scanner;

public class LogichniOperatory2 {

	public static void main(String[] args) {
System.out.println("For paing this,enter your age");
Scanner s = new Scanner (System.in);
int Age = s.nextInt();

if (Age > 18) {
System.out.println("You can bye this product");}
else {
	System.out.println("This product can be purchased by person,who have reached the age of 18");
}
}
	}


