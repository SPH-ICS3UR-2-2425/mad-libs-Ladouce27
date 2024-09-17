import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Ladouce
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a name");
		String person1 = in.nextLine();
		System.out.println("Enter a subject");
		String subject1 = in.nextLine();
		System.out.println("Enter a number");
		int num1 = in.nextInt();
		System.out.println("Enter a subject");
		in.nextLine();
		String subject2 = in.nextLine();
		

		
		
		//STORY
		System.out.println("This morning "+person1+" woke up and argued that "+subject1+" was "+num1+" times harder than "+subject2); 
		
		
		
		
	}

}
