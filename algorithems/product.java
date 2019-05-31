public class product{
	public static void main(String args[]){
		/*int[] list = {
			1,2,4,8,3,5,7,3,9
		};*/
		
		int[] list = {
			1,2,4
		};
		
		int product=1;
		
		for(int i = 0; i < list.length ;i++){
			product*=list[i];
		}
		System.out.println("the product is the list is "+product);
	}
}