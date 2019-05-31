import java.util.Scanner;

public class logic {
	
	public static void main(String[] args){
		System.out.println("what's the temputure out side today?");
		
		Scanner scan = new Scanner(System.in);
		
		byte temp = scan.nextByte();
		
		if (temp > 85){
			System.out.println("wow its hot");
		}else{
			System.out.println("nice weather");
		}
	}
	
	
	
}