package kalkulator1;

import java.util.Scanner;

public class Kalkulator1 {

	public static void main(String[] args) {
System.out.print("Enter first numeric");
Scanner chuslo = new Scanner(System.in);
double chuslo1,chuslo2,rezultat;
chuslo1 = chuslo.nextDouble();

System.out.print("Enter second numeric");
chuslo2 = chuslo.nextDouble();
rezultat = chuslo1 + chuslo2;
System.out.print("Equal:" + rezultat);

	}

}
