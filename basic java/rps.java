import java.util.Scanner;

import java.util.Random;

public class rps{
	
	static byte playerChoice; // 0 rock  1 paper   2 scicors
	
	static byte pcChoice;
	
	static boolean playing = true;
	
	public static void main (String[] args){
		while(playing){
		
		//get input from user
		getInput();
		if(playerChoice != -1 ){
		//genrate computer choice
		decideForPc();
		
		// decide winner
		byte gameStatus=decideWinner(); //-1 computer wins 0 is tie 1 is player wins
		
			switch (gameStatus){
				case -1:
				System.out.println("computer won :( ");
				break;
			
				case 0 :
				System.out.println("it was a tie :| ");
				break;
			
				case 1 :
				System.out.println("you won :) ");
				break;
			
			}
		}else{
			playing = false;
		}
	 }
	}
	public static void getInput(){
		System.out.println("whats your move? <rock,paper,scissors,lizard,spock> "+
		"or quit");	
		
		Scanner scan = new Scanner(System.in);
		
	    String inputString = scan.nextLine();	
		
		
		
		if(inputString.equals ("spock")){
			playerChoice = 0;
		}
		if(inputString.equals ("scissors")){
			playerChoice = 1;
		}
		if(inputString.equals ("paper")){
			playerChoice = 2;
		}
		if(inputString.equals ("lizard")){
			playerChoice = 4;
		}
		if(inputString.equals ("rock")){
			playerChoice = 3;
		}
		if(inputString.equals("quit")){
		playerChoice= -1;	
		}
		
	}
	
	
	public static void decideForPc (){
		Random rand = new Random();
		
		pcChoice =  (byte) rand.nextInt(5);
		
		switch (pcChoice){
			case 0:
			System.out.println("pc chose spock");
			break;
			
			case 1:
			System.out.println("pc chose scissors");
			break;
			
			case 2:
			System.out.println("pc chose paper");
			break;
			
			case 3:
			System.out.println("pc chose rock");
			break;
			
			case 4:
			System.out.println("pc chose lizard");
			break;
		}
	}
	
	
	public static byte decideWinner (){
		
		/*if(playerChoice == pcChoice){
			return 0;
		}
		
		if(playerChoice == 0 && pcChoice == 1){
			return -1;
		}
		
		if(playerChoice == 0 && pcChoice == 2){
			
		return 1;
		}
		
		if(playerChoice == 1 && pcChoice == 0){
			
			return 1;
		}
		
		if(playerChoice == 1 && pcChoice == 2){
			
			return -1;
		}
		
		if(playerChoice == 2  && pcChoice == 0){
			
			return -1;
		}
		
		if(playerChoice == 2 && pcChoice == 1){
			
			return 1;
		}
		 */
		 
		 byte diff = (byte)(playerChoice - pcChoice);
		 
		 if(diff == 0){
			 return 0;
		 }
		 
		 if(diff == -1 || diff == 2 || diff == 4 || diff == -3){
			 return 1;
		 }
		 
		 if(diff == 1 || diff == -2 || diff == -4 || diff == 3){
			 return -1;
		 }
		 
		return 0;
		
	    
	}

	
}