import java.util.Scanner;

public class logic1 {
	public static void main (String[] args){
		 System.out.println("hi can u drive? <true/false>");
		
			Scanner scan = new Scanner(System.in);
			
			boolean answear = scan.nextBoolean();
			
			if(answear == true){
				System.out.println("take me to yolo ville");
				
			}else{
				
				System.out.println("k dont take me to yolo ville");
				
			}
	}
	
	
	
}