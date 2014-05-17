package yan;

import java.util.Scanner;


public class main {
	 
	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////////////
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to MadLibs, User.");
		String verb;
		String noun;
		String adverb;
		String adjective;
		String number;
	System.out.println("Please enter a noun.");
		//tell the user to input a noun
		noun = input.nextLine();
	
	System.out.println("Awesome, You've learned what a noun is!");
		//tell the user to input a verb
	System.out.println("Please enter one verb.");
		verb = input.nextLine();
	System.out.println("Congrautlations, you know what a verb is!");
		//tell the user to input a adverb
	System.out.println("Please enter a adverb");
	    adverb = input.nextLine();
	System.out.println("Imprsesive... You've accomplished that quickly... get it? no ok..");
		//tell the user to input a adjective
	System.out.println("Please enter a adjective");
		adjective = input.nextLine();
	System.out.println("That was easy, wasn't it?");
		//Tell the user to input a number
	System.out.println("Please enter a number");
		number = input.nextLine();
	System.out.println("3...2...1, You entered a number! Wow!");
	System.out.println("You have finished MadLibs, Please continue going on in your life as you were doing before playing, thank you!");
	   
		
		System.out.println(String.format("ab %s cd  %s ef %s gh %s ij %smeow", noun,verb,adverb,number,adjective));
		
		
		
///////////////////////////////////////////////////////////////
	}

}

//Verb,Adjective,Noun,Number.
