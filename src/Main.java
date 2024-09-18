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
		System.out.println("Enter a second subject");
		in.nextLine();
		String subject2 = in.nextLine();
		System.out.println("Enter another name");
		String person2 = in.nextLine();
		System.out.println("Enter a decimal score");
		double score1 = in.nextDouble();
		System.out.println("Enter another decimal score");
		double score2 = in.nextDouble();
		System.out.println("Enter another subject");
		in.nextLine();
		String subject3= in.nextLine();
		System.out.println("Enter the number of hours");
		int num2 = in.nextInt();
		System.out.println("Enter a biology score");
		int num3 = in.nextInt();
		
		
		
		

		
		
		//STORY
		System.out.println("This morning "+person1+" woke up "
				+ "and argued that "+subject1+" was "+num1+" times harder"
						+ " than "+subject2+". "+person2+" said it was the"
								+ " opposite because he got a "+score1+" in "+subject1+" and"
										+ " a "+score2+" in "+subject2+".In reality both of"
												+ " them were not right because "+subject3+" is the worst and the hardest."
														+ "It takes "+num2+" hours to "
																+ "revise it only to get a "+num3+" on your test.");
	
		
		
		
	}

}
