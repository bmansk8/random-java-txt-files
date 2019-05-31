 import java.util.Scanner;
 
 public class madlibstory {
	 public static 	void main(String[] args){
		 
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("whats your favorite kind of weather");
		 
		 String weather = scan.nextLine();
		 
		 System.out.println("where were you born");
		 
		 String birthplc = scan.nextLine();
		 
		 System.out.println("how old are you");
		 
		 byte age = scan.nextByte();
		 
		 System.out.println("how many dollors are in a ero");
		 
		 float dolr2uro = scan.nextFloat();
		 
		 System.out.println("it was a " + weather + " day in " + birthplc + " when " + age + " cats came to eat " + birthplc +
		 " waying " + dolr2uro + " lb's and " + birthplc + " was destroyed." );
	 }
 }