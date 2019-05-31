public class mirrorarray{

	public static void main(String[] args){
	 
		int[][] a={
			{3,6,7},
			{4,1,3},
			{5,9,6}
		};
		
		int temp=0;
		
		printArray(a);
		
		
		//mult by 2
		
		int height=a.length;
		int width=a[0].length;
		
		for(int i=0; i < height/2; i++){
			
			for(int j=0; j<width;j++){
					
				temp=a[i][j]; 
				//a[i][j]=a[a[i].length-1-j];
				a[i][j]=a[(height-1)-i][j];
				a[height-1-i][j]=temp;
				//a[i][j]*=2;
			}
		}
		printArray(a);
	}
		public static void printArray(int[][] arr){
		  System.out.print("-----\n");
		  for(int i =0; i< arr.length; i++){
			for(int j =0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "\t");
			}  
			System.out.print("\n");
		  }
		  System.out.print("-----\n");
		}
}