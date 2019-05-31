import java.util.Scanner;

public class arith {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Pick a number 1 through 10");
		
		byte a = scan.nextByte();
		
		System.out.println("Pick a number 1 through 5");
		
		byte b = scan.nextByte();
		
		short sum = (byte)(a + b);
		
		byte dif = (byte)(a - b);
		
		double div =( (double) a ) / b;
		
		byte multyply =(byte)(a * b);
		
		System.out.println(a + " + " + b + " = " + sum);
		
		System.out.println(a + " - " + b + " = " + dif);
		
		System.out.println(a + " / " + b + " = " + div);
		
		System.out.println(a + " * " + b + " = " + multyply);
	}
}