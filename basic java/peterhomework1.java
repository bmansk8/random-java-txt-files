import java.util.Scanner;
import java.util.Random;

public class peterhomework1{
	
	static byte playerchoice; //0 through 5 
	
	static byte pcchoice; //0 through 5
	
	public static void main (String[] args){
		getinput();//player choice
		
		decideforpc();// pc choice
		
		byte gamestatus=winnerchoose();//if its even player wins odd pc wins 

		switch (gamestatus){
		
			case 0:
			System.out.println("you win :} ");
			break;

			case 1:
			System.out.println("you lost :{ ");
			break;
		}
	}
	
	public static void getinput(){
		
		Scanner scan = new Scanner (System.in);
		
		 playerchoice = scan.nextByte();
		
	}
	
	public static void decideforpc(){
		
		Random rand = new Random();
		
		pcchoice = (byte) rand.nextInt (6);
		
		switch (pcchoice){
			case 0:
			System.out.println("pc chose 0");
			break;
			
			case 1:
			System.out.println("pc chose 1");
			break;
			
			case 2:
			System.out.println("pc chose 2");
			break;
		
			case 3:
			System.out.println("pc chose 3");
			break;
			
			case 4:
			System.out.println("pc chose 4");
			break;
			
			case 5:
			System.out.println("pc chose 5");
			break;
		
		}
	
	}
	
	public static byte winnerchoose(){
		
		byte diff = (byte) (playerchoice - pcchoice);
		
		if(diff <0){
			
			diff *=-1;
			
		}
		
		if(diff == 0 || diff == 2 || diff == 4 ){
			return 0;
		}
		
		if(diff == 1 || diff == 3 || diff == 5){
			return 1;
		}
		
		return -1;
	}
}