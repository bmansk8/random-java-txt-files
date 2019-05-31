import java.util.Scanner;


public class loopmath{
	
	Scanner scan = new Scanner(System.in) ;
	
	public static void main(String args []){
		// factorial
		// factoral 5! 5*4*3*2*1 =
		// 3! =6
		// powers
		// 2^3 2*2*2=
		//4^4 =256
	/*int	endpower=power(4,2);
	System.out.println(endpower);*/
	
	int endfactor=factorial(5);
	System.out.println(endfactor);
	//	playerinput();
		
	/*	System.out.println();
		System.out.println(fact2 +" factored is ");
	*/
		
	}
	
	public static int factorial(int a){
		
		int fact1=a;
		fact1-=1;
		int fact2=a;
		
		for(int i =0;i<a-1;i++){
			fact2*=fact1;
			fact1--;
		}
		 
		return fact2;
	}
	
	public static int power (int plrnmbr1,int plrpwr1){
		
	int	plrnmbr2=plrnmbr1;
	
	
		
		for(int i =0;i< plrpwr1-1 ;i++){
			
			plrnmbr1*=plrnmbr2;
			
		
		}
		return plrnmbr1;
	}
	
	/*public static void playerinput{
		System.out.println("pick number to be powerd/factored");
		
		plrnmbr1=scan.nextByte();
		
		System.out.println("what do u what to power it to/if factoring put zero");
		
		plrpwr1=scan.nextByte();
	}*/
	
	
	
}