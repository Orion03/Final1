package adventure;

import java.util.Scanner;

public class Skeleton3 {

	public static void main(String[] args) {

	}
	
	public static void text() {
		
		String input4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("And thus, your adventure as a Skeleton Sorcerer begins...");
		System.out.println("		   Rise from thy grave");
		System.out.println("		Press any key to continue");
		input4 = input.next();
		
		System.out.println("You arrise from your coffin, and T-pose in the moonlight. You sheer essence destroys those without a strong "
				+ "will. A majority of human lives ended that day, and all because of your unmatched power of the T-pose.");
		System.out.println("Unfortunatly, your strong aura caught you in a ");
		Final.Dialog.text();
		
	}

}
