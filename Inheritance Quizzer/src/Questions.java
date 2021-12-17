import java.util.Scanner;
import java.text.DecimalFormat;

public class Questions
	{

		public static int counter = 0;
		
		public static Scanner tanner = new Scanner(System.in);
		
		public static DecimalFormat d = new DecimalFormat("0.00");
		
		public static void question1()
		{
			System.out.println("Question 1: What will this return?");
			System.out.println();
			System.out.println("Cars x = new Cars(); \n x.race(); \n x.enjoy();");
			System.out.println();
			System.out.println("A) \"Race a car!\" and \"This is fun!\"");
			System.out.println("B) \"Race a car!\" and \"New track record!\"");
			System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
			System.out.println("D) error");
			
			String answer = tanner.nextLine();
			
			if(answer.equals("A"))
				{
					counter++; 
					System.out.println("Correct! You have " + counter + " correct answer.");
					System.out.println();
				}
			
			else
				{
					System.out.println("Incorrect, you muppet!");
					System.out.println("The correct answer was \"A\".");
					System.out.println();
				}
		}
		
		public static void question2()
			{
				
				System.out.println("Question 2: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Cars(); \n x.race(); \n x.impress();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"Race a car!\" and \"New track record!\"");
				System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("D"))
					{
						counter++; 
						System.out.println("Correct! You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Not even close!");
						System.out.println("The correcct answer was \"D\".");
						System.out.println();
					}
				
			}
		
		public static void question3()
			{
				
				System.out.println("Question 3: What will this return?");
				System.out.println();
				System.out.println("Racecars x = new Cars(); \n x.race(); \n x.enjoy();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"Race a car!\" and \"New track record!\"");
				System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("D"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("That was embarassing!");
						System.out.println("The correct answer was \"D\".");
						System.out.println();
					}
				
			}
		
		public static void question4()
			{
				
				System.out.println("Question 4: What will this return?");
				System.out.println();
				System.out.println("Racecars x = new Racecars(); \n x.race();");
				System.out.println();
				System.out.println("A) \"New track record!\"");
				System.out.println("B) \"New track record!\" and \"WOWWWWWW!\"");
				System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("A"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect you bafoon!");
						System.out.println("The correct answer was \"A\"");
						System.out.println();
					}
				
			}
		
		public static void question5()
			{
				
				System.out.println("Question 5: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Cars(); \n x.enjoy();");
				System.out.println();
				System.out.println("A) \"Race a car!\"");
				System.out.println("B) \"Race a car!\" and \"This is fun\"");
				System.out.println("C) \"This is fun\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("C"))
					{
						counter++; 
						System.out.println("Correct! You have " + counter + " right answers.");
					}
				
				else
					{
						System.out.println("Incorrect you muppet!");
						System.out.println("The right answer was \"C\"");
						System.out.println();
					}
				
			}
		
		public static void question6()
			{
				
				System.out.println("Question 6: What will this return?");
				System.out.println();
				System.out.println("Racecar x = new Racecar(); \n x.race(); \n x.impress();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"WOWWWWWW!\"");
				System.out.println("B) \"New track record!\" and \"WOWWWWWW!\"");
				System.out.println("C) \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("B"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect you muppet!");
						System.out.println("The correct answer was \"B\"");
						System.out.println();
					}
				
			}
		
		public static void question7()
			{
				
				System.out.println("Question 7: What will this return?");
				System.out.println();
				System.out.println("Racecars x = new Racecars(); \n x.enjoy();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"This is fun\"");
				System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("B"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect you muppet! It was \"B\".");
						System.out.println();
					}
				
			}
		
		public static void question8()
			{
				
				System.out.println("Question 8: What will this return?");
				System.out.println();
				System.out.println("Racears x = new Cars(); \n x.race();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"This is fun!\" and \"New track record!\"");
				System.out.println("C) \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("D"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect! You are a little slow. It was \"D\".");
						System.out.println();
					}
				
			}
		
		public static void question9()
			{
				
				System.out.println("Question 9: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Cars(); \n x.impress();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"Race a car!\" and \"New track record!\"");
				System.out.println("C) \"Race a car!\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("D"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Nice try! It is was \"D\".");
						System.out.println();
					}
				
			}
		
		public static void question10()
			{
				
				System.out.println("Question 10: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Racecars(); \n x.race(); \n x.enjoy();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"New track record!\" and \"This is fun!\"");
				System.out.println("C) \"Race a car!\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("B"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect! It was \"B\".");
						System.out.println();
					}
				
			}
		
		public static void question11()
			{
				
				System.out.println("Question 11: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Racecars(); \n x.race(); \n x.enjoy(); \n x.impress();");
				System.out.println();
				System.out.println("A) \"Race a car!\" and \"This is fun!\"");
				System.out.println("B) \"New track record!\" and \"This is fun\"");
				System.out.println("C) \"New track record!\" and \"This is fun\" and \"WOWWWWWW!\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("C"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("Incorrect you door! The correct answer was C");
					}
				
			}
		
		public static void question12()
			{
				
				System.out.println("Question 12: What will this return?");
				System.out.println();
				System.out.println("Cars x = new Cars(); \n x.impress();");
				System.out.println();
				System.out.println("A) \"This is fun!\"");
				System.out.println("B) \"Race a car!\"");
				System.out.println("C) \"Race a car!\" and \"WOWWWWWW\"");
				System.out.println("D) error");
				
				String answer = tanner.nextLine();
				
				if(answer.equals("D"))
					{
						counter++; 
						System.out.println("You have " + counter + " correct answers.");
					}
				
				else
					{
						System.out.println("WRONGGG! It was \"D\"");
					}
			}
		
		public static void bonus()
		{
			System.out.print("Bonus Question: ");
			System.out.println("Who is the best coder between Dirk, Andrew and Carter");
			
			String answer = tanner.nextLine();
			
			if(answer.equals("Dirk"))
				{
					
					System.out.println("Incorrect! He is alright but not the best.");
				}
			
			else if(answer.equals("Andrew"))
				{
					System.out.println("Wrong! That man is a proven idiot.");
				}
			
			else
				{
					System.out.println("Correct! He is not perfect but he is pretty close.");
				}
			
		}
		
		public static void score()
			{
				
				
				System.out.println("Your score was " + counter + "/12");
			}
		
	}
