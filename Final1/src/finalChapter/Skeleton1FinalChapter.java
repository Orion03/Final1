package finalChapter;

import java.util.Scanner;

public class Skeleton1FinalChapter {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		
		Scanner input = new Scanner(System.in);
		
		int input8;
		String input9;
		int input10;
		int input11;
		
		System.out.println("The Final Chapter Begins...");
		System.out.println("Your standing at the exit. It's 4:30pm, October 31st. 30 minutes early. What humans call .:Trick-or-treating:. "
				+ "starts soon. Perfect. Foolish mortals think that skeletons are just silly children in costumes during these times, but "
				+ "little do they know that it is actually an army of undead skeletons ready to start a siege on humanity. But first, "
				+ "there's a few other things you must take care of first:");
		System.out.println("\n1 - Find other useful weapons \n2 - Find healing items \n3 - Enhance stength with milk");
		input8 = input.nextInt();
		
		if(input8 == 1)
		{
			System.out.println("So you need weapons other than a sword. Considering the merchant is out of stock, you'll have to find "
					+ "something on your own. There's a special grave up ahead, maybe it has something of use.");
			System.out.println("Raid the grave?");
			input9 = input.next();
			
			if(input9.equalsIgnoreCase("Yes") || input9.equalsIgnoreCase("y"))
			{
				System.out.println("You decide to raid the grave. You've disturbed the spirit of that grave, and you feel uneasy. You "
						+ "realize that was actually Elvis Presley's grave. He decides that you disrupted him and is punishable by death. "
						+ "You die on the spot, just from him looking at you. You died. Start your adventure over.");
			}
			
			if(input9.equalsIgnoreCase("No") || input9.equalsIgnoreCase("n"))
			{
				System.out.println("You decide not to disrupt the dead. A good decision on your part. Luckily though, there are convient "
						+ "daggers right by the grave that don't belong to anybody. You decide to pick them up. Now that you have another "
						+ "type of weapon, it's time to gather the other things:");
				System.out.println("\n1 - Find healing items \n2 - Enhance strength with milk");
				input10 = input.nextInt();
				
				if(input10 == 1)
				{
					System.out.println("You decide to search for healing items next. In the graveyard, there are many trees growing "
							+ "different types of fruits. You could probably only hold 1, though. Choose wisely:");
					System.out.println("\n1 - Apple \n2 - Orange \n3 - Peach");
					input11 = input.nextInt();
					
					if(input11 == 1)
					{
						System.out.println("You take the apple. Apparently, you've doomed all of skeletonkind. You died. Start your "
								+ "adventure over.");
					}
					
					else if(input11 == 3)
					{
						System.out.println("You take the peach. You hate the way the fuzz feels, despite being a skeleton and not having any "
								+ "nerves. You hate the way it looks, despite being a skeleton and having no eyes. The peach hates you back. "
								+ "It wants to kill you. The peach, turns out, was not actually a peach, but instead a bomb disguised as a "
								+ "peach and gained sentience. The peach blows itself up. You died. Start your adventure over.");
					}
					
					else if(input11 == 2)
					{
						
					}
				}
				
			}
		}
		
	}

}
