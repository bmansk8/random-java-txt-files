import java.util.Scanner;

import java.lang.Math;

public class methods{
	 //does stuff
	 public static void sayHi(){
		 System.out.println("HI whats yo name bra ");
	 }
	 //does stuff and takes stuff
	public static void main(String[] args){	
		//System.out.println("you imputed "+ args[0]);
		
	/*	sayHi();
		
		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		
		sayHiTo( n );
		float a = getAverage(10,3);
		System.out.println(" The average of 10 and 3 is "+a); */
		
		byte x1 = 3;
		byte x2 = 5;
		byte y1 = 7;
	  	byte y2 = 9;
		
		float dist = dist (x1,y1,x2,y2);
		
		System.out.println("the distance between ("+x1+","+y1+") and ("+x2+","+y2+") is " + dist);
	}
	
	public static void sayHiTo(String name ){
		System.out.print("hello, " + name);
	}
		//does stuff and gives stuff
     
		public static float getAverage(int  a , int b){
			
			float avg =( a + b ) / 2f;
			return avg;
			}
			//compute distance equation 
			//equation d = sqrt ( (x1-x2)^2 + (y1-y2)^2 );
	public static float dist (byte  x1 , byte y1 , byte x2 , byte y2){
		 float d = ( (x1-x2) * (x1-x2) ) + ( (y1-y2) * (y1-y2) ); 
		
  		 d = (float) Math.sqrt(d);
		 
		 return d;
	}    
			
}