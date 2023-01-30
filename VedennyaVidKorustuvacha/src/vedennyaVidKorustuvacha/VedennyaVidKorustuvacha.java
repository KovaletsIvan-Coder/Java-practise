package vedennyaVidKorustuvacha;

import java.util.Scanner;

public class VedennyaVidKorustuvacha {

	public static void main(String[] args) {
		
System.out.print("Enter your year of birth:");
Scanner Year = new Scanner(System.in);
int vik = 2023 - Year.nextInt();
System.out.println("Your age is:" + vik);
	}

}
