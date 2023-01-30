package TrenarnuyOperator;

import java.util.Scanner;

public class TrenarnuyOperator {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your ID-code");
	int id = scan.nextInt();
	System.out.println("This cost: " + ((id <1000 )?15.0 :10.0));
	}

}
// 0-1000  викладачі
// 1000-5000 студенти
// вводячи свій айді користувач дізнається чи отримає він знижку