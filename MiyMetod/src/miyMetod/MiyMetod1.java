package miyMetod;

import java.util.Scanner;

public class MiyMetod1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
    String name = scan.nextLine();
	
	System.out.println("Enter your city");
String city = scan.nextLine();
    sayHallo(name,city);
	}
public static void sayHallo (String name,String city) {
System.out.println("Hello, " + name + " from " + city);
}
}
