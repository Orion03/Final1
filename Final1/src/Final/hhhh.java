package Final;

import java.util.Scanner;

public class hhhh {

	public static class doorGame {

		public void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int doorChoice;
			int chestChoice;
			int doorChoice2;
			String result;
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to the amazing door choice game!");
			System.out.println("Your host Steve Harvey");
			System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three"); 
			doorChoice = input.nextInt();
			if(doorChoice == 1)
			{
				System.out.println("good choice, choose which chest.");
				System.out.println("1- For Chest one\n2- for Chest Two");
				chestChoice = input.nextInt();
				
				if (chestChoice == 1) {
					result = "Pile of gold";
				}
				else if(chestChoice == 2) {
					result = "nothing thats tough";
				}
				else
				{
					result = "Come on seriously"; 
				}
			}
			else if(doorChoice == 2) 
			{ 
				result = "Batman sitting on a lawn chair";
			}
			else if(doorChoice == 3) {
			    result  = "Spoodermun";
			}
			else if (doorChoice == 834) {
				System.out.println("Three other doors appear.");
				doorChoice2 = input.nextInt();
			     if (doorChoice2 == 1) {
			    	 result = "An armed assassin, death awaits";
			     }
			     else if (doorChoice2 == 2) {
			    	 result = "A doggo";
			     }
			     else if (doorChoice2 == 3) {
			    	 result = "A poweful foe, diggelet";
			     }
			     else {
			    	 result = " an error 403";
			     }
			}
			else {
			     result = "nothing."; 
			}
			displayMessage(result);
		}
		public static void displayMessage(String result) {
			System.out.println("You won "+ result);
			
			}
}
}
