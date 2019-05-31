import java.util.Scanner;

public class input{
	public static void main(String[] args){
		//creating a scanner vairable
		
		/*
		multy line comments
		*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("whats your name?");
		
		String name = scan.nextLine();
		
		System.out.println("how old are you?");
		
		byte age = scan.nextByte();
		
		scan.close();
		
		System.out.println("your name is " + name + " and you are " + age + " years old");
		
		
	}
}