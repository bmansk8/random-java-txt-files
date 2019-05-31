public class sum{
	public static void main(String args[]){
		/*int[] list = {
			1,2,4,8,3,5,7,3,9
		};*/
		
		int[] list = {
			1,2,4
		};
		
		int sum = 0;
		
		for(int i = 0; i<list.length; i++){
			sum+= list[i];
		}
		System.out.println("the sum is "+sum);
	}
}