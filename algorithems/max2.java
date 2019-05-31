import java.util.Scanner;

public class max2{
	public static void main(String args[]){
		/*int[] list = {
			1,2,4,8,3,5,7,3,9
		};*/
		
		int[] list = {
			-1,-2,-4,-8,-3,-5,-7,-3,-9
		};
		
		
		int maxIndex = 0;
		int maxValue = list[0];
		
		for(int i = 1; i < 9; i++){
			//int curValue = scan.nextInt();
			int curValue = list[i];
			if(maxValue < curValue){
				maxIndex = i;
				maxValue = curValue;
			}
		}
		
		System.out.println("highest is "+maxValue+" at index "+maxIndex);
	}
}