package adventure;

import java.util.Scanner;

public class Skeleton1 {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		
		Scanner input = new Scanner(System.in);
		
		String input4;
		String input5;
		
		System.out.println("And thus, your adventure as a Skeleton Warrior begins...");
		System.out.println("		   Rise from thy grave");
		System.out.println("		Press any key to continue");
		input4 = input.next();
		
		System.out.println("You walk through the graveyard, searching for an exit. Through your search, \nsomething catches your eye socket. It's a frog. A cool frog. \n \nApproach the "
				+ "cool frog? \n  \nYes \nNo");
		input5 = input.next();
		
		if(input5 == "Yes")
		{
			System.out.println("e");
		}
		
	}

}
