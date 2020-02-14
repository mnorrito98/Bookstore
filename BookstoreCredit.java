//BookstoreCredit.java

//2/14/2020
//MIke Norrito 

import java.util.Scanner;

public class BookstoreCredit
{
	public static void main(String[] book) 
	{
		//variables and constants 
		double gpa;
		double times;
		String student;
		String yesNo;
		String message;


		String YES_OPTION = "yes";
		String NO_OPTION = "no";
		//Objects 
		Scanner input = new Scanner(System.in);


		//input phase (Prompt)

		System.out.println("Hey there friend you're a student right? (Please only answer in lowercase " + YES_OPTION + " or " + NO_OPTION + ")");
		yesNo = input.nextLine();

		System.out.println("Great please continue!!");

//Couldnt figure out how to make this if else statement work the way i wanted 2/14/2020 ill get it to work the right way 
		/*if(yesNo == YES_OPTION ) 
		{
			
			message = "Great Happy to have you please continue! ";
		}

		else
		{
			message = "Bro or Bra come one you and I both know that you did not type what I asked you for";
			

		}*/
		
		System.out.println("hey What's your Grade Point Average? (GPA) >> ");
		gpa = input.nextDouble();


		times = 10.0;

		displayGpa(gpa, times);
		
		}
		public static void displayGpa(double g, double x)
		{
			System.out.print("congratulations on your " + g  + " gpa, you will recive your $" + (g*x) + " gift card in the mail");
		}
}