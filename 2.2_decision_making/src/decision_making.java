import java.util.Scanner;//import scanner
public class decision_making {//main method stuff created for me by eclipse

	public static void main(String[] args) {

		int userInput;//variables
		String name;
		char decision;
		
		Scanner scnr = new Scanner(System.in);//assigning scnr as user input
		
		System.out.println("What is your name?");//asks for name
		name = scnr.nextLine();//gets name
		
	do {//loop start	
			System.out.println(name + ", enter a number between 1 and 100: ");//ask user to enter number
			userInput = scnr.nextInt();//gets number
			if (userInput >= 100 && userInput <= 1)
			{
				if (userInput % 2 != 0)//checks if odd
				{	
					if (userInput >= 60)//if above 60
					{
						System.out.println(userInput + ", Odd and over 60");
					}
					else//if under 60
					{
						System.out.println(userInput + " and Odd");
					}
				}
				else//if even
					if (userInput > 60)//if above 60
					{
						System.out.println(userInput + " and Even");
					}
					else if (userInput >= 26 && userInput <= 60)//if between 26 and 60
					{
						System.out.println("Even");
					}
					else//if below 25
					{
						System.out.println("Even and less than 25");
					}
			}
			else
			{
				System.out.println("The number you entered isn't in the allowed range (1-100)");
			}
			System.out.println(name + ", would you like to conintue (Y/N)?");//asks to continue
			decision = scnr.next().charAt(0);
			//for some reason I had to use a char here because it wouldn't let me scan another   
			//string with nextLine, assuming because I previously used it for name	
				if (decision == 'Y' )//if Y repeat loop
				{
					continue;
				}
				else// if not Y end
				{
					System.out.println("Goodbye " + name + " !");
					break;
				}	
				
		}while (true);//end loop
	
		scnr.close();//scanner close
	}

}
