package swich;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
System.out.println("Enter the first letter");
Scanner scan = new Scanner(System.in);
String letter = "";
letter = scan.nextLine();
 
switch(letter.toLowerCase()) {
case "y":
	System.out.println("Its consonant and vowel letter");
  break;
case "a":
case "e":
case "i":
case "o":
case "u":
	System.out.println("It`s vowel letter");
  break;
case "q":
case "w":
case "r":
case "t":
case "p":
case "s":
case "d":
case "f":
case "g":
case "h":
case "j":
case "k":
case "l":
case "z":
case "x":
case "c":
case "v":
case "b":
case "n":
case "m":
System.out.println("It`s consonant letter");
   break;
default:
	System.out.println("It`s not a Englich letter");

}
	}

}
