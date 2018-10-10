package Final;

import java.util.Scanner;

public class Dialog {

	public static void main(String[] args) {
		
		text();
		
	}
	public static void text() {

		Scanner input = new Scanner(System.in);
		
		String input1;
		String input2;
		int input3;
		
		Text.text();
		input1 = input.next();
		
		Text.text2();
		input2 = input.next();
		
		Text.text3();
		input3 = input.nextInt();
		
		if(input3 == 1)
		{
			adventure.Skeleton1.text();
		}
		
		else if(input3 == 2)
		{
			adventure.Skeleton2.text();
		}
		
		else if(input3 == 3)
		{
			adventure.Skeleton3.text();
		}
		
		else if(input3 == 4)
		{
			adventure.Skeleton4.text();
		}
		
		else if(input3 == 5)
		{
			adventure.Skeleton5.text();
		}
		
		else
			System.out.println("Error.");
	}

}
